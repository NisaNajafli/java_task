package HesabTask5;

public class Main {
    public static void main(String[] args) {
        Depozit d = new Depozit(1000);
        d.balansGoster();
        d.faizHesabla();

        System.out.println("---");

        Kredit k = new Kredit(500);
        k.balansGoster();
        k.faizHesabla();

        // Hesab h = new Hesab(100); // <- bunu açsan compile error alacaqsan
        // "Hesab is abstract; cannot be instantiated"
    }
}
