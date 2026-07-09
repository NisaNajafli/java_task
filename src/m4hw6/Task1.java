package m4hw6;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {

        System.out.println("Task1");
        System.out.println("Zehmet olmasa bali daxil edin: ");
        double bal = sc.nextDouble();

        if (bal >= 90 && bal <= 100) {
            System.out.println("Bal: " + bal + " -> Qiymet: " + "Ela");
        } else if (bal >= 70 && bal <= 89) {
            System.out.println("Bal: " + bal + " -> Qiymet: " + "Yaxsi");
        } else if (bal >= 50 && bal <= 69) {
            System.out.println("Bal: " + bal + " -> Qiymet: " + "Kafi");
        } else if (bal < 0 || bal > 100) {
            System.out.println("Yanlis bal");
        } else {
            System.out.println("Bal: " + bal + "->  Qiymet: " + "Qeyri-Kafi");
        }
    }
}
