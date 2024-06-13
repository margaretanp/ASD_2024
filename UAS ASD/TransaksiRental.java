class TransaksiRental {
    static int nextKodeTransaksi = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    double diskon;
    BarangRental br;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = nextKodeTransaksi++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;

        hitungTotalBiaya();
    }

    private void hitungTotalBiaya() {
        double biayaPerJam = br.biayaSewa;
        double total = biayaPerJam * lamaPinjam;

        // Member mendapat potongan harga
        if (namaPeminjam.equalsIgnoreCase("member")) {
            total -= 25000; // Potongan harga untuk member
            diskon += 25000;
        }

        // Potongan harga berdasarkan lama peminjaman
        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            total *= 0.9; // Potongan 10%
            diskon += biayaPerJam * lamaPinjam * 0.1;
        } else if (lamaPinjam > 78) {
            total *= 0.8; // Potongan 20%
            diskon += biayaPerJam * lamaPinjam * 0.2;
        }

        this.totalBiaya = total;
    }
}
