package m4hw5;

import java.util.Scanner;

public class Task15 {

    public static void run(Scanner scanner) {

        System.out.println("Task15");
        // Gucu yoxlanilacaq parol istifadeciden String kimi alinir
        System.out.println("Zehmet olmasa parolu daxil edin:");
        String parol = scanner.nextLine();

        // Parolun uzunlugu length() metodu ile tapilir
        // Alinan uzunluq deyeri int tipinde saxlanilir
        int parolUzunlugu = parol.length();

        // Evvelce parolun bos olub-olmadigi yoxlanilir
        // Eger uzunluq 0-dirse, istifadeci hec bir simvol daxil etmeyib
        if (parolUzunlugu == 0) {
            System.out.println("Parol bos ola bilmez");

            // Parolun uzunlugu 6-dan azdirsa, bu parol zeif hesab olunur
        } else if (parolUzunlugu < 6) {
            System.out.println("Zeif");

            // Parolun uzunlugu 6 ve 9 araligindadirsa, bu parol orta guclu hesab olunur
        } else if (parolUzunlugu >= 6 && parolUzunlugu <= 9) {
            System.out.println("Orta");

            // Parolun uzunlugu 10 ve daha coxdursa, bu parol guclu hesab olunur
        } else {
            System.out.println("Guclu");
        }

    }
}