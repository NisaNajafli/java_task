package m4hw5;

import java.util.Scanner;

public class Task11 {

    public static void run(Scanner scanner) {

        System.out.println("Task11");
        // Yoxlanilacaq simvol istifadeciden alinir
        System.out.println("Zehmet olmasa bir herf daxil edin:");
        char herf = scanner.next().charAt(0);

        // Evvelce daxil edilen simvolun herf olub-olmadigi yoxlanilir
        // Eger reqem ve ya basqa simvol daxil edilibse, proqram xeberdarliq verir
        if (!Character.isLetter(herf)) {
            System.out.println("Yanlis daxiletme: herf daxil edin");

        } else {
            // Simvol herfdirse, switch ile sait ve ya samit oldugu yoxlanilir
            // Hem kicik, hem de boyuk sait herfler case kimi qeyd olunur
            switch (herf) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println("Sait");
                    break;

                // Herfdir, amma sait deyilse, samit kimi cap olunur
                default:
                    System.out.println("Samit");
            }
        }

    }
}