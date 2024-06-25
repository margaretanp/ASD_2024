import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        // Tambahkan data awal
        Mahasiswa.mahasiswaList.add(new Mahasiswa("111", "Falah", "11-07-2003"));
        Mahasiswa.mahasiswaList.add(new Mahasiswa("222", "Garet", "19-11-2004"));
        Mahasiswa.mahasiswaList.add(new Mahasiswa("333", "Jua", "14-02-2000"));
        Mahasiswa.mahasiswaList.add(new Mahasiswa("444", "Irul", "21-04-2002"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Lihat Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa.tambahMahasiswa(scanner);
                    break;
                case 2:
                    Mahasiswa.hapusMahasiswa(scanner);
                    break;
                case 3:
                    Mahasiswa.lihatMahasiswa(scanner);
                    break;
                case 4:
                    Mahasiswa.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
