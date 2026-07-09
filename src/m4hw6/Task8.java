package m4hw6;

import java.util.Scanner;

public class Task8 {
    public static void run(Scanner sc) {

        System.out.println("Task8");

        System.out.println("Yasinizi daxil edin: ");
        int yas = sc.nextInt();

        double qiymet;

        if (yas <= 7) {
            qiymet = 0;
        } else if (yas <= 17) {
            qiymet = 3;
        } else if (yas <= 64) {
            qiymet = 7;
        } else {
            qiymet = 4;
        }

        System.out.println("Bir biletin qiymeti: " + qiymet + " AZN");

        System.out.println("Nece bilet almaq isteyirsiniz: ");
        int biletSayi = sc.nextInt();

        double umumiMebleg = qiymet * biletSayi;

        System.out.println("Odeniləcek umumi meblegi: " + umumiMebleg + " AZN");
    }
}