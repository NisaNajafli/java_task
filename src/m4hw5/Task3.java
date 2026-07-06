package m4hw5;

import java.util.Scanner;

public class Task3 {

    public static void run(Scanner scanner) {

        System.out.println("Task3");
        // Imtahan bali istifadeciden alinir
        System.out.println("Zehmet olmasa imtahan balini daxil edin:");
        int bal = scanner.nextInt();

        // Bal araligina gore qiymetlendirme neticesi mueyyen edilir
        if (bal >= 90 && bal <= 100) {
            System.out.println("Ela (5)");
        } else if (bal >= 80 && bal <= 89) {
            System.out.println("Cox yaxsi (4)");
        } else if (bal >= 70 && bal <= 79) {
            System.out.println("Yaxsi (3)");
        } else if (bal >= 60 && bal <= 69) {
            System.out.println("Kafi (2)");
        } else if (bal >= 0 && bal <= 59) {
            System.out.println("Qeyri-kafi (1)");
        }
        else {
            System.out.println("Yanlis bal!");
        }

    }
}