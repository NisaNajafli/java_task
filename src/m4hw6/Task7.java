package m4hw6;

import java.util.Scanner;

public class Task7 {
    public static void run(Scanner sc) {

        System.out.println("Task7");

        int gizli = 42;
        int cehd = 0;

        System.out.println("Bir eded daxil edin: ");
        int texmin = sc.nextInt();
        cehd++;

        while (texmin != gizli) {

            if (texmin > gizli) {
                System.out.println("Boyukdur");
            } else {
                System.out.println("Kicikdir");
            }

            System.out.println("Bir eded daxil edin: ");
            texmin = sc.nextInt();
            cehd++;
        }

        System.out.println("Tapdin!");
        System.out.println("Cehd sayi: " + cehd);
    }
}