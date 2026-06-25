package m4hw3;

public class Bonus {

    public static void main(String[] args) {

        final int    MIN_YAS          = 18;
        final int    MIN_PAROL_UZUNLUGU = 8;
        final double MIN_GELIR        = 500.0;

        String ad     = "nigar";
        int    yas    = 22;
        double gelir  = 750.0;
        String parol  = "Nigar@2024";
        String email  = "nigar@abb.az";


        boolean adBosDegildir        = ad.length() > 0;
        boolean yasUygundu           = yas >= MIN_YAS;
        boolean gelirUygundu         = gelir > MIN_GELIR;
        boolean parolUzunluguUygundu = parol.length() >= MIN_PAROL_UZUNLUGU;
        boolean emailDuzgundu        = email.contains("@");
        boolean qeydiyyatUgurludur   = adBosDegildir && yasUygundu && gelirUygundu
                && parolUzunluguUygundu && emailDuzgundu;


        String adFormatli = ad.substring(0, 1).toUpperCase() + ad.substring(1);

        System.out.println("=== Qeydiyyat Yoxlaması ===");
        System.out.println("Ad:                  " + adFormatli);
        System.out.println("Ad boş deyil:        " + adBosDegildir);
        System.out.println("Yaş uyğundur:        " + yasUygundu);
        System.out.println("Gəlir uyğundur:      " + gelirUygundu);
        System.out.println("Parol uyğundur:      " + parolUzunluguUygundu);
        System.out.println("Email uyğundur:      " + emailDuzgundu);
        System.out.println("===========================");
        System.out.println("Qeydiyyat uğurludur: " + qeydiyyatUgurludur);

    }

}