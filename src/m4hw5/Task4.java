package m4hw5;

import java.util.Scanner;

public class Task4 {

    public static void run(Scanner scanner) {

        System.out.println("Task4");
        // Yoxlanilacaq il istifadeciden alinir
        System.out.println("Zehmet olmasa ili daxil edin:");
        int il = scanner.nextInt();

        // Il 400-e bolunurse ve ya 4-e bolunub 100-e bolunmurse uygun il hesab olunur
        boolean sert = (il % 400 == 0) || (il % 4 == 0 && il % 100 != 0);

        // Ternary operator ile netice tek setirde cap edilir
        String netice = sert ? "Uygun il" : "Uygun deyil";
        System.out.println(netice);

    }
}