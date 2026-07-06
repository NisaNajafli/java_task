package m4hw5;

import java.util.Scanner;

public class Task2 {

    public static void run(Scanner scanner) {

        System.out.println("Task2");
        // Müqayisə olunacaq 3 tam ədəd istifadəçidən alınır
        System.out.println("Zehmet olmasa 1ci tam ededi daxil edin:");
        int eded1 = scanner.nextInt();

        System.out.println("Zehmet olmasa 2ci tam ededi daxil edin:");
        int eded2 = scanner.nextInt();

        System.out.println("Zehmet olmasa 3cu tam ededi daxil edin:");
        int eded3 = scanner.nextInt();

        int maxEded;
        int minEded;

        // Əvvəlcə ən böyük ədəd müəyyən edilir
        if (eded1 >= eded2 && eded1 >= eded3) {
            maxEded = eded1;
        } else if (eded2 >= eded1 && eded2 >= eded3) {
            maxEded = eded2;
        } else {
            maxEded = eded3;
        }

        // Daha sonra ən kiçik ədəd müəyyən edilir
        if (eded1 <= eded2 && eded1 <= eded3) {
            minEded = eded1;
        } else if (eded2 <= eded1 && eded2 <= eded3) {
            minEded = eded2;
        } else {
            minEded = eded3;
        }

        System.out.println("En boyuk: " + maxEded);
        System.out.println("En kicik: " + minEded);

    }
}