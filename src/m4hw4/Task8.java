package m4hw4;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa Celsius deqreni (tam eded) daxil edin :");
        int c = sc.nextInt();

        double fSehv = c * 9 / 5 + 32;

        double fDuzgun = c * 9.0 / 5 + 32;

        System.out.println("Celsius: " + c);
        System.out.println("1-ci variant (9/5, int bolme) -> Fahrenheit: " + fSehv);
        System.out.println("2-ci variant (9.0/5, double bolme) -> Fahrenheit: " + fDuzgun);

        /* Izah:
         Duzgun formul: F = C * 9/5 + 32

         1-ci variantda "9 / 5" ifadesi iki int (9 ve 5) arasindaki
         bolmedir. Java-da int / int = int qaydasina gore netice
         1.8 yox, sadece 1 olur (ondalik hisse atilir).
         Beleliklikle "c * 9 / 5" emeliyyati aslinda "c * 1" kimi
         hesablanir - bu, duzgun formuldan tamamile ferqli neticedir.
         Meselen c = 20 olsa: 20 * 9 / 5 = 180 / 5 = 36, + 32 = 68
         (dogru neticeye tesaduf uygun gele biler, amma umumiyyetle sehvdir)

         2-ci variantda "9.0 / 5" ifadesinde 9.0 artiq double tipindedir.
         Java-da eger operandlardan biri double-dursa, diger operand da
         avtomatik olaraq double-a genislendirilir (widening), ve
         bolme netice de double olaraq duzgun hesablanir: 9.0 / 5 = 1.8.
         Beleliklikle "c * 9.0 / 5" duzgun riyazi neticeni verir.

         Yeni: sadece "9"-u "9.0" etmekle butun ifadenin davranisi
         deyisir, cunki Java operatorlarin tipini SOLDAN SAGA, opeand-
         larin tipine gore tey edir. */
    }
}