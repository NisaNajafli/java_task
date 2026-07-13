package m4hw7;

import java.util.Scanner;

public class Task3{
    public static void run(Scanner sc) {

        System.out.println("Task3");
        int stok = 200;

        System.out.println("Əməliyyat sayı daxil et (müsbət = mal gəlib, mənfi = mal satılıb, 0 = dayan): ");
        int emeliyyat = sc.nextInt();

        while (emeliyyat != 0) {
            stok = stok + emeliyyat;

            System.out.println("Yeni stok: " + stok);

            System.out.print("Əməliyyat sayı daxil et: ");
            emeliyyat = sc.nextInt();
        }

    }
}