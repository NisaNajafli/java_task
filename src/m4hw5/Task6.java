package m4hw5;

import java.util.Scanner;

public class Task6 {

    public static void run(Scanner scanner) {

        System.out.println("Task6");
        // Hesablama ucun iki eded istifadeciden alinir
        System.out.println("Zehmet olmasa birinci ededi daxil edin:");
        double eded1 = scanner.nextDouble();

        System.out.println("Zehmet olmasa ikinci ededi daxil edin:");
        double eded2 = scanner.nextDouble();

        // Emeliyyat isaresi String kimi daxil edilir
        System.out.println("Zehmet olmasa emeliyyat isaresini daxil edin: +, -, *, /");
        String emeliyyat = scanner.next();

        // Emeliyyat isaresine gore hesablanma aparilir
        switch (emeliyyat) {
            case "+":
                System.out.println("Netice: " + (eded1 + eded2));
                break;
            case "-":
                System.out.println("Netice: " + (eded1 - eded2));
                break;
            case "*":
                System.out.println("Netice: " + (eded1 * eded2));
                break;
            case "/":
                if (eded2 == 0) {
                    System.out.println("0-a bolmek olmaz!");
                } else {
                    System.out.println("Netice: " + (eded1 / eded2));
                }
                break;
            default:
                System.out.println("Naməlum emeliyyat isaresi");
        }

    }
}