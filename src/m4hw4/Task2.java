package m4hw4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa kredit meblegini daxil edin :");
        double meblag = sc.nextDouble();

        System.out.println("Zehmet olmasa illik faiz faizini daxil edin (%) :");
        double faiz = sc.nextDouble();

        System.out.println("Zehmet olmasa muddeti daxil edin (ay) :");
        int muddet = sc.nextInt();

        double umumiFaiz = meblag * (faiz / 100);
        double umumiOdenis = meblag + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Umumi faiz: " + umumiFaiz);
        System.out.println("Umumi odenis: " + umumiOdenis);
        System.out.println("Ayliq odenis: " + ayliqOdenis);
    }
}