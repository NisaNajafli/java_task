package m4hw3;

public class Task12 {

    public void run() {

        String tamAd = "nigar əliyeva";

        int bosluqIndeksi = tamAd.indexOf(" "); // 5 — boslugun indeksi

        String ad    = tamAd.substring(0, bosluqIndeksi);         // "nigar"
        String soyad = tamAd.substring(bosluqIndeksi + 1);        // "əliyeva"

        String adFormatli   = ad.substring(0, 1).toUpperCase() + ad.substring(1);       // "Nigar"
        String soyadFormatli = soyad.substring(0, 1).toUpperCase() + soyad.substring(1); // "Əliyeva"

        String basHerfler = ad.substring(0, 1).toUpperCase() + "." + soyad.substring(0, 1).toUpperCase() + "."; // "N.Ə."

        System.out.println("Tam ad (formatlanmış): " + adFormatli + " " + soyadFormatli);
        System.out.println("Yalnız ad:             " + adFormatli);
        System.out.println("Yalnız soyad:          " + soyadFormatli);
        System.out.println("Baş hərflər:           " + basHerfler);
        System.out.println("Böyük hərflə:          " + tamAd.toUpperCase());

    }

}