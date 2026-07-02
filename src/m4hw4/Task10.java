package m4hw4;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa Ad-Soyad daxil edin :");
        String adSoyad = sc.nextLine();

        System.out.println("Zehmet olmasa yasinizi daxil edin :");
        int yash = sc.nextInt();

        System.out.println("Zehmet olmasa illik gelirinizi daxil edin :");
        String gelirString = sc.next();
        double gelir = Double.parseDouble(gelirString);

        boolean adSoyadShert = adSoyad.contains(" ") && adSoyad.length() >= 5;
        boolean yashShert = yash >= 18 && yash <= 70;
        boolean gelirShert = gelir >= 3000;

        boolean uygundur = adSoyadShert && yashShert && gelirShert;

        String adSoyadBoyuk = adSoyad.toUpperCase();

        System.out.println("---- SIGORTA MURACIETI HESABATI ----");
        System.out.printf("Ad-Soyad: %s%n", adSoyadBoyuk);
        System.out.printf("Yas: %d%n", yash);
        System.out.printf("Illik gelir: %.2f AZN%n", gelir);
        System.out.println("Ad-Soyad sherti (boslugla ve 5+ simvol): " + adSoyadShert);
        System.out.println("Yas sherti (18-70 arasi): " + yashShert);
        System.out.println("Gelir sherti (3000+ AZN): " + gelirShert);
        System.out.printf("Netice: Muraciet %s%n", uygundur ? "TESDIQ EDILDI" : "REDD EDILDI");
    }
}
