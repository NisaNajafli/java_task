package m4hw6;

import java.util.Scanner;

public class Task4 {
    public static void run(Scanner sc) {


        System.out.println("Task4");

        int[] qollar = new int[5];
        int enCoxQol =0;
        int enYaxsiOyunçu = 0;
        boolean beraberdir = true;

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + "-ci oyuncunun qol sayini daxil edin: ");
            int qol = sc.nextInt();

            while (qol < 0) {
                System.out.println("Yanlis deyer! Qol sayi menfi ola bilmez. Yeniden daxil edin: ");
                qol = sc.nextInt();
            }

            qollar[i] = qol;

            if (qollar[i] > enCoxQol) {
                enCoxQol = qollar[i];
                enYaxsiOyunçu = i + 1;
            }

            if (qollar[i] != qollar[0]) {
                beraberdir = false;
            }
        }

        if (beraberdir) {
            System.out.println("Butun oyuncularin qol sayi beraberdir: " + enCoxQol);
        } else {
            System.out.println("En cox qol vuran oyuncu: " + enYaxsiOyunçu + " (Qol sayi: " + enCoxQol + ")");
        }
    }
}