package GununEmeliyyatlari_6;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> emeliyyatlar = new ArrayList<>();

        emeliyyatlar.add(588);
        emeliyyatlar.add(900);
        emeliyyatlar.add(134);
        emeliyyatlar.add(783);
        emeliyyatlar.add(500);

        System.out.println("Günün əməliyyatları: " + emeliyyatlar);

        int umumiCem = 0;
        for (int mebleg : emeliyyatlar) {
            umumiCem = umumiCem + mebleg;
        }
        System.out.println("Ümumi cəm: " + umumiCem + " AZN");
        System.out.println("Əməliyyat sayı: " + emeliyyatlar.size());

        emeliyyatlar.clear();

        System.out.println("--- İş günü bağlandı ---");
        System.out.println("Siyahı: " + emeliyyatlar);
        System.out.println("Siyahı boşdur? " + emeliyyatlar.isEmpty());
        System.out.println("Element sayı: " + emeliyyatlar.size());
    }
}
