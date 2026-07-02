package m4hw4;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa bir eded daxil edin:");
        String ededString = sc.next();

        int ededInt = Integer.parseInt(ededString);

        int netice = ededInt + 10;

        String neticeString = String.valueOf(netice);

        int uzunluq = neticeString.length();

        System.out.println("Daxil edilen String: " + ededString);
        System.out.println("int-e cevrilmis deyer: " + ededInt);
        System.out.println("Emeliyyatdan sonraki netice (int): " + netice);
        System.out.println("Yeniden String-e cevrilmis netice: " + neticeString);
        System.out.println("Bu String-in uzunlugu: " + uzunluq);
    }
}