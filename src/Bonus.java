public class Bonus {

    public static void main(String[] args) {

        String musteriAdi = "Nisa Najafli";
        int yas = 23;
        double ayliqGelir = 5600.56;

        double kreditMeblegi = 10000.0;
        int aySayi = 8;
        double faiz = 10.9;

        boolean kreditTarixi = true;

        double umumiFaiz = kreditMeblegi * faiz / 100;
        double ayliqOdenis = (kreditMeblegi + umumiFaiz) / aySayi;
        double gelireNisbet = ayliqOdenis / ayliqGelir * 100;

        boolean yasUyundur = yas >= 21 && yas <= 65;
        boolean gelirUyundur = ayliqGelir > 800;
        boolean meblegUyundur = kreditMeblegi >= 300 && kreditMeblegi <= 50000;
        boolean nisbetUyundur = gelireNisbet < 40;

        boolean kreditTesdiqlenir = yasUyundur
                && gelirUyundur
                && meblegUyundur
                && nisbetUyundur
                && kreditTarixi;

        System.out.println("Müştəri adı: " + musteriAdi);
        System.out.println("Yaş: " + yas);
        System.out.println("Aylıq gəlir: " + ayliqGelir);

        System.out.println("\nKredit məbləği: " + kreditMeblegi);
        System.out.println("Müddət: " + aySayi + " ay");
        System.out.println("İllik faiz: " + faiz + "%");

        System.out.println("\nÜmumi faiz: " + umumiFaiz);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);
        System.out.println("Gəlirə nisbət: " + gelireNisbet + "%");

        System.out.println("\nYaş şərti: " + yasUyundur);
        System.out.println("Gəlir şərti: " + gelirUyundur);
        System.out.println("Məbləğ şərti: " + meblegUyundur);
        System.out.println("Gəlirə nisbət 40%-dən azdır: " + nisbetUyundur);
        System.out.println("Kredit tarixi yaxşıdır: " + kreditTarixi);

        System.out.println("\nKredit təsdiqlənir: " + kreditTesdiqlenir);
    }
}