package m4hw6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Butun tapsiriqlar burada ardicil olaraq ise salinir
        Task1.run(sc);
        Task2.run(sc);
        Task3.run(sc);
        Task4.run(sc);
        Task5.run(sc);
        Task6.run(sc);
        Task7.run(sc);
        Task8.run(sc);
        Task9.run(sc);
        sc.close();
    }
}