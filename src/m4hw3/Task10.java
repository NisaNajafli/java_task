package m4hw3;

public class Task10 {

    public void run() {

        int    mebleg = 5000;
        int    faiz   = 15;

        // Xeta: mebleg * faiz / 100 — hamisi int-dir.
        // int * int = int, int / int = int => 5000 * 15 = 75000, 75000 / 100 = 750 (ondaliq itir)
        // double faizMeblegi = ... yazmaq komek etmir, hesablama int olaraq bitir, sonra double-a cevrilir.
        // Duzeltmek ucun boleni 100.0 etmek lazimdir ki, bolme double bolmeyə çevrilsin.

       double faizMeblegi = mebleg * faiz / 100.0; // 5000 * 15 = 75000, 75000 / 100.0 = 750.0

        // double faizMeblegi = (double)(mebleg * faiz / 100.0); // Belede yazmaq olar

        System.out.println("Faiz məbləği: " + faizMeblegi); // 750.0

    }

}