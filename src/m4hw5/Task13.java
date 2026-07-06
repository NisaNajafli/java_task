package m4hw5;

import java.util.Scanner;

public class Task13 {

    public static void run(Scanner scanner) {

        System.out.println("Task13");
        // BMI hesablamaq ucun ceki kiloqramla istifadeciden alinir
        System.out.println("Zehmet olmasa cekinizi daxil edin:");
        double ceki = scanner.nextDouble();

        // BMI hesablamaq ucun boy metrle istifadeciden alinir
        System.out.println("Zehmet olmasa boyunuzu daxil edin:");
        double boy = scanner.nextDouble();

        // BMI dusturu: ceki / (boy * boy)
        // Netice double tipinde saxlanilir, cunki BMI kesr eded ola biler
        double bmi = ceki / (boy * boy);

        // Hesablanmis BMI deyeri ekrana cap olunur
        System.out.println("BMI: " + bmi);

        // BMI neticesine gore uygun kateqoriya mueyyen edilir
        if (bmi < 18.5) {
            System.out.println("Ariq");

            // 18.5 daxil olmaqla 24.9-a qeder normal kateqoriyasidir
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");

            // 25 daxil olmaqla 29.9-a qeder artiq cekili kateqoriyasidir
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Artiq cekili");

            // 30 ve daha yuxari BMI piylenme kateqoriyasina daxildir
        } else {
            System.out.println("Piylenme");
        }

    }
}