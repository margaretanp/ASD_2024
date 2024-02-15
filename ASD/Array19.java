import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Prolem Solving", 
            "Matematika Dasar", "Bahasa inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];
        double ipSemester = 0;
        double totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            
            if (nilaiAngka[i] < 0 && nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid");
            } else {
                if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                    nilaiHuruf[i] = "A";
                    nilaiSetara[i] = 4.0;
                } else if (nilaiAngka[i] >= 73 && nilaiAngka[i] < 80) {
                    nilaiHuruf[i] = "B+";
                    nilaiSetara[i] = 3.5;
                } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] < 73) {
                    nilaiHuruf[i] = "B";
                    nilaiSetara[i] = 3.0;
                } else if (nilaiAngka[i] >= 60 && nilaiAngka[i] < 65) {
                    nilaiHuruf[i] = "C+";
                    nilaiSetara[i] = 2.5;
                } else if (nilaiAngka[i] >= 50 && nilaiAngka[i] < 60) {
                    nilaiHuruf[i] = "C";
                    nilaiSetara[i] = 2.0;
                } else if (nilaiAngka[i] >= 40 && nilaiAngka[i] < 50) {
                    nilaiHuruf[i] = "D";
                    nilaiSetara[i] = 1;
                } else if (nilaiAngka[i] <= 39){
                    nilaiHuruf[i] = "E";
                    nilaiSetara[i] = 0;
                }

                totalSKS += sks[i];
                ipSemester += nilaiSetara[i] * sks[i];
            }
        }

        ipSemester /= totalSKS;
        
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.println();
        System.out.printf("%-40s %-20s %-20s %-20s %n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {    
            System.out.printf("%-40s %-20.2f %-20s %-20.2f %n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }            
        
        System.out.println("==============================");
        System.out.printf("IP: %.2f%n", ipSemester);
    }
}
