import java.util.Scanner;
import java.util.Stack;

public class StackMain14 {
    public static void main(String[] args) {
    
    StackPakaian19 stk19 = new StackPakaian19(5);
    Scanner sc19 = new Scanner(System.in);

     char pilih;
    
    do{
        System.out.print("Jenis: ");
        String jenis = sc19.nextLine();
        System.out.print("Warna: ");
        String warna = sc19.nextLine();
        System.out.print("Merk: ");
        String merk = sc19.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc19.nextLine();
        System.out.print("Harga: ");
        double harga = sc19.nextDouble();

        Pakaian19 p19 = new Pakaian19(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahakan data baru ke stack (y/n)? ");
        pilih = sc19.next().charAt(0);
        sc19.nextLine();
        stk19.push(p19);
    } while (pilih == 'y');

    stk19.getMax();
    stk19.print();
    stk19.pop();
    stk19.peek();
    stk19.print();

    }
}
