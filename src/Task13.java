public class Task13 {

    public static void main(String[] args) {

        // 1-ci müştəri
        int musteri1Yas = 34;
        double musteri1Gelir = 1500;
        double musteri1Kredit = 10000;
        boolean musteri1Tarix = true;

        boolean yasSerti1 = musteri1Yas >= 21 && musteri1Yas <= 65;
        boolean gelirSerti1 = musteri1Gelir > 800;
        boolean meblegSerti1 = musteri1Kredit >= 300 && musteri1Kredit <= 50000;

        boolean netice1 = yasSerti1
                && gelirSerti1
                && meblegSerti1
                && musteri1Tarix;


        // 2-ci müştəri
        int musteri2Yas = 19;
        double musteri2Gelir = 950;
        double musteri2Kredit = 3000;
        boolean musteri2Tarix = true;

        boolean netice2 = musteri2Yas >= 21
                && musteri2Yas <= 65
                && musteri2Gelir > 800
                && musteri2Kredit >= 300
                && musteri2Kredit <= 50000
                && musteri2Tarix;


        // 3-cü müştəri
        int musteri3Yas = 45;
        double musteri3Gelir = 750;
        double musteri3Kredit = 7000;
        boolean musteri3Tarix = false;

        boolean netice3 = musteri3Yas >= 21
                && musteri3Yas <= 65
                && musteri3Gelir > 800
                && musteri3Kredit >= 300
                && musteri3Kredit <= 50000
                && musteri3Tarix;


        System.out.println("Birinci müştərinin nəticəsi: " + netice1);
        System.out.println("İkinci müştərinin nəticəsi: " + netice2);
        System.out.println("Üçüncü müştərinin nəticəsi: " + netice3);
    }
}