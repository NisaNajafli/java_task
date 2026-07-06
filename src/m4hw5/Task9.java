package m4hw5;

import java.util.Scanner;

public class Task9 {

    public static void run(Scanner scanner) {

        System.out.println("Task9");
        // Fesli tapmaq ucun ay nomresi istifadeciden alinir
        System.out.println("Zehmet olmasa 1-12 arasi ay nomresi daxil edin:");
        int ayNomresi = scanner.nextInt();

        // Switch ile ay nomresine gore fesil mueyyen edilir
        // Eyni fesle aid olan aylar fall-through vasitesile bir yerde qruplasdirilir
        switch (ayNomresi) {

            // 12, 1 ve 2-ci aylar qis fesline aiddir
            // Burada case 12 ve case 1 ucun break yazilmir ki, kod case 2-ye qeder davam etsin
            case 12:
            case 1:
            case 2:
                System.out.println("Qis");
                break;

            // 3, 4 ve 5-ci aylar yaz fesline aiddir
            // Fall-through sayesinde bu uc ay ucun eyni netice cap olunur
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;

            // 6, 7 ve 8-ci aylar yay fesline aiddir
            // Bu case-ler eyni mesaji cap etmek ucun birlikde yazilib
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;

            // 9, 10 ve 11-ci aylar payiz fesline aiddir
            // Case 9 ve case 10 break olmadan case 11-e dusur
            case 9:
            case 10:
            case 11:
                System.out.println("Payiz");
                break;

            // 1-12 araligindan kenar eded daxil edilse, yanlis ay nomresi mesaji cap olunur
            default:
                System.out.println("Yanlis ay nomresi");
        }

    }
}