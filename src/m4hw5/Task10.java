package m4hw5;

import java.util.Scanner;

public class Task10 {

    public static void run(Scanner scanner) {

        System.out.println("Task10");
        // Istifadeciye bank menyusu gosterilir
        System.out.println("Bank menyusu:");
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatir");
        System.out.println("3 - Pul cixar");
        System.out.println("4 - Cixis");

        // Menyudan secim etmek ucun istifadeciden 1-4 arasi eded alinir
        System.out.println("Zehmet olmasa seciminizi daxil edin:");
        int secim = scanner.nextInt();

        // Switch ile istifadecinin secimine uygun mesaj cap edilir
        switch (secim) {

            // Istifadeci 1 secdikde balans haqqinda mesaj gosterilir
            case 1:
                System.out.println("Balansiniz: 1250 AZN");
                break;

            // Istifadeci 2 secdikde pul yatirma emeliyyati ucun mesaj gosterilir
            // Real bank emeliyyati aparilmir, yalniz uygun mesaj cap olunur
            case 2:
                System.out.println("Pul yatirma emeliyyati secildi");
                break;

            // Istifadeci 3 secdikde pul cixarma emeliyyati ucun mesaj gosterilir
            // Bu tapsiriqda sadece mesaj cap etmek kifayetdir
            case 3:
                System.out.println("Pul cixarma emeliyyati secildi");
                break;

            // Istifadeci 4 secdikde sistemden cixis mesaji cap olunur
            case 4:
                System.out.println("Cixis edildi");
                break;

            // 1-4 araligindan kenar secim edilse, yanlis secim mesaji cap olunur
            default:
                System.out.println("Yanlis secim");
        }

    }
}