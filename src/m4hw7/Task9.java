package m4hw7;
import java.util.Scanner;

public class Task9 {
    public static void run(Scanner sc) {

        System.out.println("Task9");
        System.out.println("=== Vahid çevirici ===");
        System.out.println("1) Metr -> Fut");
        System.out.println("2) Kiloqram -> Funt");
        System.out.println("3) Selsi -> Fahrenheit");
        System.out.println("0) Çıxış");
        System.out.print("Seçimini daxil et: ");
        int secim = sc.nextInt();

        while (secim != 0) {

            if (secim == 1) {
                // 1 metr = 3.28084 fut
                System.out.print("Metri daxil et: ");
                double metr = sc.nextDouble();
                double fut = metr * 3.28084;
                System.out.println("Nəticə: " + fut);

            } else if (secim == 2) {
                // 1 kiloqram = 2.20462 funt
                System.out.print("Kiloqramı daxil et: ");
                double kiloqram = sc.nextDouble();
                double funt = kiloqram * 2.20462;
                System.out.println("Nəticə: " + funt);

            } else if (secim == 3) {
                // F = C * 9/5 + 32

                System.out.print("Selsini daxil et: ");
                double selsi = sc.nextDouble();
                double fahrenheit = selsi * 9.0 / 5 + 32;
                System.out.println("Nəticə: " + fahrenheit);

            } else {
                System.out.println("Yanlış seçim, yenidən cəhd et");
            }

            System.out.println();
            System.out.println("=== Vahid çevirici ===");
            System.out.println("1) Metr -> Fut");
            System.out.println("2) Kiloqram -> Funt");
            System.out.println("3) Selsi -> Fahrenheit");
            System.out.println("0) Çıxış");
            System.out.print("Seçimini daxil et: ");
            secim = sc.nextInt();
        }

        System.out.println("Çıxış edildi");

    }
}
