package m4hw5;

import java.util.Scanner;

public class Task12 {

    public static void run(Scanner scanner) {

        System.out.println("Task12");
        // Bilet qiymetini mueyyen etmek ucun yas istifadeciden alinir
        System.out.println("Zehmet olmasa yasinizi daxil edin:");
        int yas = scanner.nextInt();

        // Evvelce menfi yas yoxlanilir, cunki yas menfi ola bilmez
        if (yas < 0) {
            System.out.println("Yanlis yas");

            // 0-5 yas araliginda olan istifadeciler ucun bilet pulsuzdur
        } else if (yas >= 0 && yas <= 5) {
            System.out.println("Pulsuz");

            // 6-17 yas araliginda olan istifadeciler ucun bilet qiymeti 5 AZN-dir
        } else if (yas >= 6 && yas <= 17) {
            System.out.println("5 AZN");

            // 18-64 yas araliginda olan istifadeciler ucun bilet qiymeti 10 AZN-dir
        } else if (yas >= 18 && yas <= 64) {
            System.out.println("10 AZN");

            // 65 ve yuxari yas ucun bilet qiymeti 3 AZN-dir
        } else {
            System.out.println("3 AZN");
        }

    }
}