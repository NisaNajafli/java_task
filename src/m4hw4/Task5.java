package m4hw4;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa bir tam eded (int) daxil edin :");
        int tamEded = sc.nextInt();

        double genislenmisEded = tamEded;
        System.out.println("int deyer: " + tamEded);
        System.out.println("double-a genislendirilmis deyer: " + genislenmisEded);

        System.out.println("Zehmet olmasa bir onluq kesr (double) daxil edin :");
        double onluqEded = sc.nextDouble();

        int daralmisEded = (int) onluqEded;
        System.out.println("double deyer: " + onluqEded);
        System.out.println("int-e daraldilmis deyer: " + daralmisEded);

        /* Izah: narrowing zamani (double -> int) Java ondalik hisseni
           yuvarlaqlasdirmir, sadece atir.
           Meselen 9.87 -> 9 olur, 9.99 -> yene 9 olur (10-a yuvarlanmir).
           Bunun sebebi int tipinin ondalik hisse saxlaya bilmemesidir -
           (int) cast eden zaman Java sadece rəqəmin tam eded hissesini goturur,
           vergulden sonraki her ne varsa, deyerinden asili olmayaraq atilir. */
    }
}