import java.util.Scanner;

public class Pemilihan19 {
    public static void main(String[] args) {
        Scanner Pemilihan19 = new Scanner(System.in);
        
        double nilaiTugas;
        double nilaiKuis;
        double nilaiUTS;
        double nilaiUAS;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("______________________________");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = Pemilihan19.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = Pemilihan19.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = Pemilihan19.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = Pemilihan19.nextDouble();
        System.out.println("_________________________________");

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid ");
        } else {
            nilaiTugas = 0.2 * nilaiTugas;
            nilaiKuis = 0.2 * nilaiKuis;
            nilaiUTS = 0.3 * nilaiUTS;
            nilaiUAS = 0.3 * nilaiUAS;
            
            double N = nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;

            if (N >= 80 && N <= 100) {
                nilaiHuruf = "A";
            } else if (N >= 73 && N < 80) {
                nilaiHuruf = "B+";
            } else if (N >= 65 && N < 73) {
                nilaiHuruf = "B";
            } else if (N >= 60 && N < 65) {
                nilaiHuruf = "C+";
            } else if (N >= 50 && N < 60) {
                nilaiHuruf = "C";
            } else if (N >= 40 && N < 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai Akhir " + N);
            System.out.println("Nilai Huruf " + nilaiHuruf);
            System.out.println("_________________________________");
            String pesanKelulusan = N < 50 ? "Anda Tidak Lulus" : "Selamat Anda Lulus";
            System.out.println(pesanKelulusan);
            
        }

        System.out.println("_________________________________");
    }
}