package m4hw4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa a deyerini daxil edin :");
        int a = sc.nextInt();

        System.out.println("Zehmet olmasa b deyerini daxil edin :");
        int b = sc.nextInt();

        System.out.println("Deyisdirmeden evvel -> a = " + a + ", b = " + b);

        a = a + b;   // 1-ci addim
        System.out.println("1-ci addimdan sonra (a = a + b) -> a = " + a + ", b = " + b);

        b = a - b;   // 2-ci addim
        System.out.println("2-ci addimdan sonra (b = a - b) -> a = " + a + ", b = " + b);

        a = a - b;   // 3-cu addim
        System.out.println("3-cu addimdan sonra (a = a - b) -> a = " + a + ", b = " + b);

        System.out.println("Netice -> a = " + a + ", b = " + b);
    }
}