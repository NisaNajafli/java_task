package m4hw4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa 3 reqemli tam eded daxil edin :");
        int sayi = sc.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        int cem = yuzler + onlar + birler;

        System.out.println("Yuzler reqemi: " + yuzler);
        System.out.println("Onlar reqemi: " + onlar);
        System.out.println("Birler reqemi: " + birler);
        System.out.println("Reqemlerin cemi: " + cem);
    }
}