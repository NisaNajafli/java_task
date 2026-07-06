package m4hw5;

import java.util.Scanner;

public class Task1 {

    public static void run(Scanner scanner){

        System.out.println("Task1");
        // İstifadəciden yoxlanilacaq tam ədəd alinır
        System.out.println("Zehmet olmasa bir tam eded daxil edin:");
        int tamEded = scanner.nextInt();

        // Daxil edilen ededin cut, tek ve ya sıfır olması yoxlanılır
        if (tamEded == 0) {
            System.out.println("Eded ne tekdir, ne de cutdur");
        } else if (tamEded % 2 == 0) {
            System.out.println("Eded cutdur");
        } else {
            System.out.println("Eded tekdir");
        }

        // Daxil edilen ededin musbet, menfi ve ya sıfır olması mueyyen edilir
        if (tamEded > 0) {
            System.out.println("Eded musbetdir");
        } else if (tamEded < 0) {
            System.out.println("Eded menfidir");
        } else {
            System.out.println("Eded sifirdir");
        }

    }
}