class Transaksi19 {
    private double saldo;
    private double saldoAwal;
    private double saldoAkhir;
    private String tanggalTransaksi;
    private String type;

    public Transaksi19(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo +
                "\nSaldo Awal: " + saldoAwal +
                "\nSaldo Akhir: " + saldoAkhir +
                "\nTanggal Transaksi: " + tanggalTransaksi +
                "\nType: " + type + "\n";
    }
}
