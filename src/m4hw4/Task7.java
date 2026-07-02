package m4hw4;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa musbet bir onluq kesr (double) daxil edin :");
        double musbetDeyer = sc.nextDouble();

        int musbetCast = (int) musbetDeyer;
        long musbetRound = Math.round(musbetDeyer);

        System.out.println("Daxil edilen deyer: " + musbetDeyer);
        System.out.println("(int) casting neticesi: " + musbetCast);
        System.out.println("Math.round() neticesi: " + musbetRound);

        System.out.println("Zehmet olmasa menfi bir onluq kesr (double) daxil edin :");
        double menfiDeyer = sc.nextDouble();

        int menfiCast = (int) menfiDeyer;
        long menfiRound = Math.round(menfiDeyer);

        System.out.println("Daxil edilen deyer: " + menfiDeyer);
        System.out.println("(int) casting neticesi: " + menfiCast);
        System.out.println("Math.round() neticesi: " + menfiRound);

        /*
          Izah:
          (int) casting sadece ondalik hisseni ATIR, yuvarlaqlasdirmir.
          Meselen -4.7 -> -4 olur (yaxinliga deyil, sifira deqre kesilir).

          Math.round() ise riyazi qaydada duzgun yuvarlaqlasdirir.
          Musbet ededlerde .5 ve yuxari yuxariya yuvarlanir (4.7 -> 5).
          Menfi ededlerde ise Math.round() = Math.floor(deyer + 0.5) kimi isleyir,
          yeni -4.7 + 0.5 = -4.2, ve floor(-4.2) = -5 olur.

          Beleliklikle -4.7 uzerinde:
            (int) -4.7        -> -4   (sadece kesilir, sifira teref)
            Math.round(-4.7)  -> -5   (duzgun yuvarlaqlasdirilir, asagiya)

          Bu ferq xususile menfi ededlerde onemlidir, cunki (int) casting
         her zaman "sifira teref" kesir, Math.round() ise en yaxin
          tam edede (menfi terefde daha asagi ola biler) yuvarlaqlasdirir.
         */
    }
}