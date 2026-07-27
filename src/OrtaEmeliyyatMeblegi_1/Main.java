package OrtaEmeliyyatMeblegi_1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umumiXerc = 1240;

        System.out.print("Əməliyyat sayını daxil edin: ");

        try {
            int emeliyyatSayi = sc.nextInt();
            int ortaMebleg = umumiXerc / emeliyyatSayi;

            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);
        } catch (ArithmeticException e) {
            System.out.println("Əməliyyat sayı sıfır ola bilməz!");

        } catch (Exception e) {
            System.out.println("Yanlış məlumat daxil edilib.");

        } finally {
            System.out.println("Hesabat tamamlandı");
        }

        sc.close();
    }
}