public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga, totalHarga = 0, totalHargaDiskon = 0, hargaBayar = 0;

    public Buku19() {

    }

    public Buku19(String jud, String pg, int hal, int stok, int hrg) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = hrg;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Total diskon: " + totalHargaDiskon);
        System.out.println("Total harga bayar: " + hargaBayar);
    }
    void terjual(int jml) {
        if (stok > 0 ) {
            stok -= jml;
        } 
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        stok -= jml;
        return totalHarga = harga * jml;
    }

    int hitungDiskon() {
        if(totalHarga > 150000) {
            totalHargaDiskon = totalHarga * 12/100;
        } else if(totalHarga >= 75000 || totalHarga <= 150000) {
            totalHargaDiskon = totalHarga * 5/100;
        } else if(totalHarga < 75000) {
            totalHargaDiskon = 0;
        }
        return totalHargaDiskon;
    }

    int hitungHargaBayar() {
        return hargaBayar = totalHarga - totalHargaDiskon;
    }
}
