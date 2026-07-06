package m4hw5;

import java.util.Scanner;

public class Task14 {

    public static void run(Scanner scanner) {

        System.out.println("Task14");
        // Maliye rubunu tapmaq ucun ay nomresi istifadeciden alinir
        System.out.println("Zehmet olmasa 1-12 arasi ay nomresi daxil edin:");
        int ayNomresi = scanner.nextInt();

        // Switch ile ay nomresinin hansi rube aid oldugu yoxlanilir
        // Eyni rube aid aylar fall-through ile birlikde qruplasdirilir
        switch (ayNomresi) {

            // 1, 2 ve 3-cu aylar I rube aiddir
            // Case 1 ve case 2-de break yazilmir ki, kod case 3-e qeder davam etsin
            case 1:
            case 2:
            case 3:
                System.out.println("I rub");
                break;

            // 4, 5 ve 6-ci aylar II rube aiddir
            // Fall-through sayesinde bu uc ay ucun eyni netice cap olunur
            case 4:
            case 5:
            case 6:
                System.out.println("II rub");
                break;

            // 7, 8 ve 9-cu aylar III rube aiddir
            // Bu case-ler eyni rube aid oldugu ucun birlikde yazilib
            case 7:
            case 8:
            case 9:
                System.out.println("III rub");
                break;

            // 10, 11 ve 12-ci aylar IV rube aiddir
            // Case 10 ve case 11 break olmadan case 12-ye dusur
            case 10:
            case 11:
            case 12:
                System.out.println("IV rub");
                break;

            // 1-12 araligindan kenar eded daxil edilse, xeberdarliq mesaji cap olunur
            default:
                System.out.println("Yanlis ay nomresi");
        }

    }
}