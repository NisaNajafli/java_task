package m4hw7;
import java.util.Scanner;

public class Task2 {

    public static void run(Scanner sc) {

        System.out.println("Task2");

        String[] gunler = {"1-ci", "2-ci", "3-cü"};

        int gunSayi = 3;
        double umumiMebleg = 0;

        int i = 0;
        while (i < gunSayi) {
            System.out.print(gunler[i] + " günün satışı: ");
            double satis = sc.nextDouble();
            umumiMebleg = umumiMebleg + satis;
            i++;
        }

        double ortaSatis = umumiMebleg / gunSayi;

        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");
        System.out.println("Orta günlük satış: " + ortaSatis + " AZN");

        if (ortaSatis > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }

    }}