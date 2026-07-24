package FaylTask8;

public class FaylMenecer implements Yuklene, Endirile {
    @Override
    public void yukle() {
        System.out.println("Fayl yüklənir...");
    }

    @Override
    public void endir() {
        System.out.println("Fayl endirilir...");
    }
}
