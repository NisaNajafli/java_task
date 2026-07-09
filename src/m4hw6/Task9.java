package m4hw6;

import java.util.Scanner;

public class Task9 {
    public static void run(Scanner sc) {


        System.out.println("Task9");
        System.out.println("Menyu:");
        System.out.println("1) Cem");
        System.out.println("2) Ferq");
        System.out.println("3) Hasil");
        System.out.println("4) Bolme");
        System.out.println("0) Cixis");
        System.out.println("Seciminizi daxil edin: ");
        int secim = sc.nextInt();

        while (secim != 0) {

            switch (secim) {
                case 1:
                    System.out.println("1-ci edadi daxil edin: ");
                    double a1 = sc.nextDouble();
                    System.out.println("2-ci edadi daxil edin: ");
                    double b1 = sc.nextDouble();
                    System.out.println("Netice: " + (a1 + b1));
                    break;

                case 2:
                    System.out.println("1-ci edadi daxil edin: ");
                    double a2 = sc.nextDouble();
                    System.out.println("2-ci edadi daxil edin: ");
                    double b2 = sc.nextDouble();
                    System.out.println("Netice: " + (a2 - b2));
                    break;

                case 3:
                    System.out.println("1-ci edadi daxil edin: ");
                    double a3 = sc.nextDouble();
                    System.out.println("2-ci edadi daxil edin: ");
                    double b3 = sc.nextDouble();
                    System.out.println("Netice: " + (a3 * b3));
                    break;

                case 4:
                    System.out.println("1-ci edadi daxil edin: ");
                    double a4 = sc.nextDouble();
                    System.out.println("2-ci edadi daxil edin: ");
                    double b4 = sc.nextDouble();

                    if (b4 == 0) {
                        System.out.println("Xeta: sifire bolme olmaz!");
                    } else {
                        System.out.println("Netice: " + (a4 / b4));
                    }
                    break;

                default:
                    System.out.println("Yanlis secim!");
            }

            System.out.println();
            System.out.println("Menyu:");
            System.out.println("1) Cem");
            System.out.println("2) Ferq");
            System.out.println("3) Hasil");
            System.out.println("4) Bolme");
            System.out.println("0) Cixis");
            System.out.println("Seciminizi daxil edin: ");
            secim = sc.nextInt();
        }

        System.out.println("Cixis edildi.");
    }
}