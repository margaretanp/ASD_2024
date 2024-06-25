public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku() {
    }

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String tampil() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }
}
