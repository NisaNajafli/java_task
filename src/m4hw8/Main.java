package m4hw8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Butun tapsiriqlar burada ardicil olaraq ise salinir
        Task1.run();
        Task2.run();
        Task3.run(sc);
        Task4.run(sc);
        Task5.run();
        Task6.run();
        Task7.run();
        Task8.run();
        Task9.run();
        Task10.run();
        Task11.run();
        Task12.run();
        sc.close();
    }
}