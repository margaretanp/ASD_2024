import java.util.Scanner;

public class tugas02_19 {
    static Scanner sc = new Scanner(System.in);
    static double v = 0;
    static double s = 0;
    static double t = 0;

    public static void kecepatan() {
        System.out.print("s = ");
        s = sc.nextDouble();
        System.out.print("t = ");
        t = sc.nextDouble();

        v = s / t;
        System.out.printf("v = %.2f%n", v);
    }

    public static void jarak() {
        System.out.print("v = ");
        v = sc.nextDouble();
        System.out.print("t = ");
        t = sc.nextDouble();

        s = v * t;
        System.out.printf("s = %.2f%n", s);
    }

    public static void waktu() {
        System.out.print("s = ");
        s = sc.nextDouble();
        System.out.print("v = ");
        v = sc.nextDouble();

        t = s / v;
        System.out.printf("t = %.2f%n", t);
    }

    public static void main(String[] args) {
        int menu;

        do {
            System.out.print("1. Kecepatan\n" + "2. Jarak\n" + "3. Waktu\n" + "Menu: ");
            menu = sc.nextInt();
            
            switch(menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                    break;
            }
        } while (menu >= 1 && menu < 3);
    }
}
