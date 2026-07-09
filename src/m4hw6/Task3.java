package m4hw6;

import java.util.Scanner;

public class Task3 {

    public static void run(Scanner sc) {


        System.out.println("Task3");
        System.out.println("Ilkin balansi daxil edin: ");

        double balans = sc.nextDouble();

        System.out.println("Bashlangic balans: " + balans);

        while (true) {
            System.out.println("Emeliyyat meblegini daxil edin : ");
            double emeliyyat = sc.nextDouble();

            if (emeliyyat == 0) {
                System.out.println("Emeliyyatlar dayandirildi");
                break;
            }

            balans += emeliyyat;
            System.out.println("Yeni balans: " + balans);

            if (balans < 0) {
                System.out.println("Xeberdarliq! Balans menfiye dushdu.");
            }
        }

        System.out.println("Son balans: " + balans);
    }
}