import java.text.SimpleDateFormat;
import java.util.Date;

public class Tugas2Main19 {

    public static void main(String[] args) {
        Date waktu = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,DD MMMM YYYY");
        
        Tugas219 struk = new Tugas219(8);
        Tugas219[] belanja = new Tugas219[8];
        String date = sdf.format(waktu);
        
        belanja[0] = new Tugas219("MEDSBK-090-445", 6, 2400000, date);
        belanja[1] = new Tugas219("MEDSBK-080-446", 7, 1500000, date);
        belanja[2] = new Tugas219("MEDSBK-056-447", 15, 1800000, date);
        belanja[3] = new Tugas219("MEDSBK-683-448", 6, 190000, date);
        belanja[4] = new Tugas219("MEDSBK-936-449", 2, 2356000, date);
        belanja[5] = new Tugas219("MEDSBK-081-441", 5, 800000, date);
        belanja[6] = new Tugas219("MEDSBK-482-442", 1, 6900000, date);
        belanja[7] = new Tugas219("MEDSBK-593-443", 7, 4700000, date);
        
        for (int i = 0; i < struk.size; i++) {
            struk.push(belanja[i]);
        }
        struk.print();
        System.out.println("\tData yang di-pop |struk 5 minggu|");
        struk.line(50);
        for (int i = 0; i < 5; i++) {
            struk.pop();
        }
        struk.print();
    }
}
