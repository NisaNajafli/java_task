package m4hw6;

import java.util.Scanner;

public class Task5 {
    public static void run(Scanner sc) {


        System.out.println("Task5");
        System.out.println("Ilkin emanet meblegini daxil edin: ");
        double ilkinMebleg = sc.nextDouble();

        System.out.println("Illik faiz derecesini daxil edin (%): ");
        double faiz = sc.nextDouble();

        double mebleg = ilkinMebleg;
        double hedef = ilkinMebleg * 2;
        int il = 0;

        while (mebleg < hedef) {
            mebleg += mebleg * (faiz / 100);
            il++;
            System.out.println(il + "-ci il: " + mebleg);
        }

        System.out.println("Meblegin ilkin deyerin iki qatina catmasi ucun kecen il sayi: " + il);
    }
}