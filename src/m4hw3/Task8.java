package m4hw3;

public class Task8 {

    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        // Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun   = yas >= 21 && yas < 65; // yas > 21 yanlisdi, 21 yasli musteri daxil olmalidir
        boolean gelirUygun = gelir > 800;            // duzdu
        boolean uygun      = yasUygun && gelirUygun && tarix; // || yanlisdi, butun sertler eyni vaxtda odenilmelidir

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);

    }

}