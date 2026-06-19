public class Task4 {

    public static void main(String[] args){

        int yas = 25;                   // Xəta 1: Java-da tam ədəd tipi `int` kiçik hərf ilə yazılır
        String sehir = "baku";            // Xəta 2: Sting tipli dəyərlər " " içində yazılmalıdır
        double kreditMeblegi = 5000;   // Xəta 3: Dəyişən adında boşluq ola bilməz. Buna görə `kredit meblegi` əvəzinə camelCase formasında `kreditMeblegi` yazılır.
        boolean aktiv = true;          // Xəta 4: Java case-sensitive dildir. Boolean dəyərləri `true` və `false` kiçik hərflə yazılır.
        final int LIMIT = 100;
        //LIMIT = 200;                  // Xəta 5: final dəyişən olduğu üçün ona yenidən dəyər vermək olmaz.
        System.out.println(yas);       // Xəta 6: Java-da hər əmrin sonuna nöqtə deyil, nöqtəli vergül `;` qoyulur.

    }
}
