package m4hw6;

import java.util.Scanner;

public class Task2 {
    public static void run(Scanner sc ) {

        System.out.println("Task2");
        double cem = 0;

        for (int i = 1; i <= 10; i++) {
            double bal;

            do {
                System.out.println(i + "-ci telebenin balini daxil edin (0-100): ");
                bal = sc.nextDouble();

                if (bal < 0 || bal > 100) {
                    System.out.println("Yanlis bal! Zehmet olmasa 0-100 arasinda deger daxil edin.");
                }
            } while (bal < 0 || bal > 100);

            cem += bal;
        }

        double orta = cem / 10;

        System.out.println("Cem: " + cem);
        System.out.println("Orta bal: " + orta);

        if (orta > 70) {
            System.out.println("Sinif ugurludur");
        } else {
            System.out.println("Elave ise ehtiyac var");
        }
    }
}