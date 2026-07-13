package m4hw7;
import java.util.Scanner;

public class Task8 {

    public static void run(Scanner sc) {

        System.out.println("Task8");
        System.out.print("Yaşı daxil et: ");
        int yas = sc.nextInt();

        int biletQiymeti;

        /*
           0-6 -> pulsuz (0 AZN)
           7-17 -> 2 AZN
           18-60 -> 5 AZN
           61+ -> 3 AZN
         */
        if (yas <= 6) {
            biletQiymeti = 0;
        } else if (yas <= 17) {
            biletQiymeti = 2;
        } else if (yas <= 60) {
            biletQiymeti = 5;
        } else {
            biletQiymeti = 3;
        }

        System.out.println("Bir biletin qiyməti: " + biletQiymeti + " AZN");


        System.out.print("Neçə bilet alırsan? ");
        int biletSayi = sc.nextInt();

        int umumiMebleg = biletQiymeti * biletSayi;
        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");

    }
}
