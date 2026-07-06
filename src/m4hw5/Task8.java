package m4hw5;

import java.util.Scanner;

public class Task8 {

    public static void run(Scanner scanner) {

        System.out.println("Task8");
        // Ucbucagin teref uzunluqlari istifadeciden alinir
        System.out.println("Zehmet olmasa birinci terefi daxil edin:");
        double teref1 = scanner.nextDouble();

        System.out.println("Zehmet olmasa ikinci terefi daxil edin:");
        double teref2 = scanner.nextDouble();

        System.out.println("Zehmet olmasa ucuncu terefi daxil edin:");
        double teref3 = scanner.nextDouble();

        // Ucbucagin movcud olub-olmadigini yoxlamaq ucun sert yaradilir
        // Her bir teref diger iki terefin ceminden kicik olmalidir
        boolean ucbucaqMovcuddur = teref1 < teref2 + teref3 &&
                teref2 < teref1 + teref3 &&
                teref3 < teref1 + teref2;

        // Evvelce daxil edilen tereflerle ucbucaq qurmagin mumkun olub-olmadigi yoxlanilir
        if (ucbucaqMovcuddur) {

            // Butun terefler bir-birine beraberdirse, bu beraberterefli ucbucaqdir
            if (teref1 == teref2 && teref2 == teref3) {
                System.out.println("Beraberterefli");

                // Yalniz iki teref beraberdirse, bu beraberyanli ucbucaqdir
            } else if (teref1 == teref2 || teref1 == teref3 || teref2 == teref3) {
                System.out.println("Beraberyanli");

                // Hec bir teref bir-birine beraber deyilse, bu muxtelifterefli ucbucaqdir
            } else {
                System.out.println("Muxtelifterefli");
            }

            // Eger ucbucaq sertleri odenmirse, bu tereflerle ucbucaq movcud deyil
        } else {
            System.out.println("Bele ucbucaq movcud deyil");
        }

    }
}