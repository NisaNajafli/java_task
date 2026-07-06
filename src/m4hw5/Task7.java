package m4hw5;

import java.util.Scanner;

public class Task7 {

    public static void run(Scanner scanner) {

        System.out.println("Task7");
        // Kredit muracieti ucun lazim olan melumatlar istifadeciden alinir
        System.out.println("Zehmet olmasa yasinizi daxil edin:");
        int yas = scanner.nextInt();

        System.out.println("Zehmet olmasa ayliq gelirinizi daxil edin:");
        double ayliqGelir = scanner.nextDouble();

        System.out.println("Zehmet olmasa kredit meblegini daxil edin:");
        double kreditMeblegi = scanner.nextDouble();

        // Butun sertlerin uygun olub-olmadigini saxlamaq ucun deyisen yaradilir
        boolean kreditTesdiqOlundu = true;

        // Yas serti yoxlanilir: yas 21 ve 65 araliginda olmalidir
        if (yas < 21 || yas > 65) {
            System.out.println("Redd edildi: yas uygun deyil");
            kreditTesdiqOlundu = false;
        }

        // Gelir serti yoxlanilir: ayliq gelir 800-den cox olmalidir
        if (ayliqGelir < 800) {
            System.out.println("Redd edildi: gelir uygun deyil");
            kreditTesdiqOlundu = false;
        }

        // Kredit meblegi serti yoxlanilir: mebleg 300 ve 50000 araliginda olmalidir
        if (kreditMeblegi < 300 || kreditMeblegi > 50000) {
            System.out.println("Redd edildi: kredit meblegi uygun deyil");
            kreditTesdiqOlundu = false;
        }

        // Eger yuxaridaki sertlerden hec biri pozulmayibsa, kredit tesdiq edilir
        if (kreditTesdiqOlundu) {
            System.out.println("TESDIQ EDILDI");
        }

    }
}