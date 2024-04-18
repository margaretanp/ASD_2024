import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTransaksi19 {
    private static ArrayList<Rekening19> rekenings = new ArrayList<>();
    private static ArrayList<Transaksi19> transaksis = new ArrayList<>();

    public static void main(String[] args) {
        inputDataRekening();
        inputDataTransaksi();

        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tampilDataRekening();
                    break;
                case 2:
                    tampilDataTransaksi();
                    break;
                case 3:
                    cariSaldoLebihDari(500000);
                    break;
                case 4:
                    urutkanDataRekening();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 5);
    }

    private static void inputDataRekening() {
        // Input data rekening dari data yang diberikan
        rekenings.add(new Rekening19("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"));
        rekenings.add(new Rekening19("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        rekenings.add(new Rekening19("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"));
        rekenings.add(new Rekening19("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"));
        rekenings.add(new Rekening19("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));
        rekenings.add(new Rekening19("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"));
        rekenings.add(new Rekening19("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"));
        rekenings.add(new Rekening19("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        rekenings.add(new Rekening19("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        rekenings.add(new Rekening19("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"));
        rekenings.add(new Rekening19("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"));
        rekenings.add(new Rekening19("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"));
        rekenings.add(new Rekening19("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"));
        rekenings.add(new Rekening19("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"));
        rekenings.add(new Rekening19("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"));
        rekenings.add(new Rekening19("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"));
        rekenings.add(new Rekening19("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"));
        rekenings.add(new Rekening19("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"));
        rekenings.add(new Rekening19("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com"));
    }

    private static void inputDataTransaksi() {
        // Input data transaksi dari data yang diberikan
        transaksis.add(new Transaksi19(898214, 494048, 3587, "2021-03-09 07:54:42", "deposit"));
        transaksis.add(new Transaksi19(205420, 200162, 775880, "2021-06-25 10:23:00", "withdraw"));
        transaksis.add(new Transaksi19(838632, 350929, 328316, "2021-09-18 23:00:04", "deposit"));
        transaksis.add(new Transaksi19(230659, 204434, 690503, "2022-02-02 19:10:34", "withdraw"));
        transaksis.add(new Transaksi19(770592, 334245, 444267, "2020-08-11 13:36:56", "deposit"));
        transaksis.add(new Transaksi19(685302, 451002, 376442, "2020-05-23 07:34:53", "withdraw"));
        transaksis.add(new Transaksi19(816129, 851403, 597842, "2021-07-18 19:41:20", "deposit"));
        transaksis.add(new Transaksi19(989609, 333823, 802752, "2022-02-01 01:13:11", "withdraw"));
        transaksis.add(new Transaksi19(297103, 396116, 779589, "2021-07-03 01:09:49", "deposit"));
        transaksis.add(new Transaksi19(66190, 259150, 619774, "2021-09-09 03:57:30", "withdraw"));
        transaksis.add(new Transaksi19(234301, 278309, 547922, "2021-08-24 13:18:39", "deposit"));
        transaksis.add(new Transaksi19(243306, 869468, 50283, "2021-03-12 03:40:16", "withdraw"));
        transaksis.add(new Transaksi19(371045, 991242, 602034, "2021-08-06 11:48:59", "deposit"));
        transaksis.add(new Transaksi19(395170, 97058, 472273, "2021-05-02 10:53:31", "withdraw"));
        transaksis.add(new Transaksi19(862731, 561908, 109431, "2021-07-31 08:11:00", "deposit"));
        transaksis.add(new Transaksi19(556798, 31387, 725426, "2021-03-27 06:18:20", "withdraw"));
        transaksis.add(new Transaksi19(873982, 896213, 846142, "2021-07-18 04:06:30", "deposit"));
        transaksis.add(new Transaksi19(774247, 739406, 775848, "2020-10-24 01:39:00", "withdraw"));
        transaksis.add(new Transaksi19(66987, 823014, 868772, "2020-12-21 05:57:59", "deposit"));
    }

    private static void tampilDataRekening() {
        for (Rekening19 rekening : rekenings) {
            System.out.println(rekening);
        }
    }

    private static void tampilDataTransaksi() {
        for (Transaksi19 transaksi : transaksis) {
            System.out.println(transaksi);
        }
    }

    private static void cariSaldoLebihDari(double saldo) {
        System.out.println("Rekening dengan saldo lebih dari " + saldo + ":");
        for (Transaksi19 transaksi : transaksis) {
            if (transaksi.getSaldo() > saldo) {
                System.out.println(transaksi);
            }
        }
    }

    private static void urutkanDataRekening() {
        Collections.sort(rekenings, Comparator.comparing(Rekening19::getNama));
        System.out.println("Data rekening setelah diurutkan berdasarkan nama:");
        tampilDataRekening();
    }
}
