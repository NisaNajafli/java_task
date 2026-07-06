package m4hw5;

import java.util.Scanner;

public class Task5 {

    public static void run(Scanner scanner) {
        System.out.println("Task5");
        // Gun nomresi istifadeciden alinir
        System.out.println("Zehmet olmasa 1-7 arasi gun nomresi daxil edin:");
        int gunNomresi = scanner.nextInt();

        // Gun nomresine gore heftenin gun adi mueyyen edilir
        switch (gunNomresi) {
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                System.out.println("Heftesonu!");
                break;
            case 7:
                //bu iki case üçün break yazilmir
                System.out.println("Bazar");
                System.out.println("Heftesonu!");
                break;
            default:
                System.out.println("Yanlis gun nomresi");
        }

    }
}