package m4hw7;
import java.util.Scanner;

public class Task7 {

    public static void run(Scanner sc) {

        System.out.println("Task7");
        int gizliKod = 275;

        int cehdSayi = 0;

        System.out.print("Kodu daxil et (1-999): ");
        int tehmin = sc.nextInt();
        cehdSayi++;

        while (tehmin != gizliKod) {

            if (tehmin > gizliKod) {
                System.out.println("Böyükdür");
            } else {
                System.out.println("Kiçikdir");
            }

            System.out.print("Kodu daxil et (1-999): ");
            tehmin = sc.nextInt();
            cehdSayi++;
        }

        System.out.println("Seyf açıldı!");
        System.out.println("Cəhdlərin sayı: " + cehdSayi);

    }
}
