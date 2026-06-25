package m4hw3;

public class Task9 {

    public void run() {

        String kod = "  abb-2024  ";

        System.out.println(kod.length());
        // Xeta: gozlenilen 8 idi, amma netice 12-dir.
        // Sebeb: "  abb-2024  " stringinde evvel 2, sonda 2 bosluq var.
        // length() butun karakterleri sayir, bosluqlari da daxil edir.
        // Duzgun: kod.trim().length() => 8

        System.out.println(kod.contains("abb"));
        // Xeta: kod.contains("ABB") yazilmisdi, netice false idi.
        // Sebeb: Java-da String case-sensitive-dir. "abb-2024" icinde "ABB" yoxdur, "abb" var.
        // Duzgun: "ABB" yox "abb" axtarmaq lazimdir.

        System.out.println(kod.trim().equals("abb-2024"));
        // Xeta: kod.trim() == "abb-2024" yazilmisdi, netice false idi.
        // Sebeb: == operator iki obyektin yaddasdaki adresini muqayise edir, deyerini yox.
        // String muqayisesinde her zaman .equals() isletmek lazimdir.
        // Duzgun: kod.trim().equals("abb-2024") => true

        System.out.println(kod.toUpperCase().contains("ABB"));
        // Duzdu. evvelde kod butun herflerini boyuk edir => "  ABB-2024  "
        // Sonra "ABB" axtarir => true

    }

}