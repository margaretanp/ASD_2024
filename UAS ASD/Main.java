import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static BarangRental[] daftarBarang = {
            new BarangRental("N0001BA", "Honda Beat", "Motor", 2019, 100000),
            new BarangRental("N0002AG", "Yamaha NMAX", "Motor", 2020, 150000),
            new BarangRental("N0003HJ", "Honda W175", "Motor", 2018, 200000),
            new BarangRental("N0004YH", "Mazda 3", "Mobil", 2022, 400000),
            new BarangRental("B1212GA", "BMW Z4", "Mobil", 2021, 800000),
            new BarangRental("B5151PK", "Toyota Supra", "Mobil", 2016, 700000),
    };

    static LinkedList<TransaksiRental> transaksi = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi berdasarkan No TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    prosesPeminjaman(scanner);
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }

    static void tampilkanDaftarKendaraan() {
        System.out.println("Daftar Kendaraan:");
        System.out.printf("%-8s | %-15s | %-10s | %-5s | %s\n", "No TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa");
        for (BarangRental br : daftarBarang) {
            System.out.printf("%-8s | %-15s | %-10s | %-5d | %d/jam\n", br.noTNKB, br.namaKendaraan, br.jenisKendaraan, br.tahun, br.biayaSewa);
        }
    }

    static void prosesPeminjaman(Scanner scanner) {
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan nomor TNKB kendaraan yang akan dipinjam: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan lama pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        BarangRental barangDipinjam = cariBarangByNoTNKB(noTNKB);

        if (barangDipinjam == null) {
            System.out.println("Kendaraan dengan nomor TNKB tersebut tidak ditemukan.");
            return;
        }

        // Cek ketersediaan barang (selalu true untuk contoh ini)
        boolean barangReady = true;

        if (!barangReady) {
            System.out.println("Maaf, kendaraan sudah dipinjam orang lain.");
            return;
        }

        // Buat transaksi baru dan tambahkan ke linked list
        TransaksiRental newTransaksi = new TransaksiRental(namaPeminjam, lamaPinjam, barangDipinjam);
        transaksi.add(newTransaksi);
        System.out.println("Peminjaman berhasil dilakukan.");
    }

    static void tampilkanSeluruhTransaksi() {
        double totalPendapatan = 0;
        double totalDiskon = 0;

        System.out.println("Seluruh Transaksi:");
        System.out.printf("%-10s | %-15s | %-15s | %-10s | %-10s | %-10s\n", "Kode", "Nama Peminjam", "No TNKB", "Biaya Total", "Diskon", "Jenis Kendaraan");
        for (TransaksiRental tr : transaksi) {
            System.out.printf("%-10d | %-15s | %-15s | %-10.2f | %-10.2f | %-10s\n",
                    tr.kodeTransaksi, tr.namaPeminjam, tr.br.noTNKB, tr.totalBiaya, tr.diskon, tr.br.jenisKendaraan);
            totalPendapatan += tr.totalBiaya;
            totalDiskon += tr.diskon;
        }

        System.out.printf("\nTotal Pendapatan: %.2f\n", totalPendapatan);
        System.out.printf("Total Diskon: %.2f\n", totalDiskon);
    }

    static void urutkanTransaksi() {
        // Tidak perlu diimplementasikan ulang karena LinkedList dapat diakses secara terurut
        // berdasarkan penambahan elemen.
        transaksi.sort((tr1, tr2) -> tr1.br.noTNKB.compareTo(tr2.br.noTNKB));
        System.out.println("Transaksi berhasil diurutkan berdasarkan No TNKB.");
    }

    static BarangRental cariBarangByNoTNKB(String noTNKB) {
        for (BarangRental br : daftarBarang) {
            if (br.noTNKB.equals(noTNKB)) {
                return br;
            }
        }
        return null;
    }
}
