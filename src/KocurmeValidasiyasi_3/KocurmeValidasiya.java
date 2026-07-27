package KocurmeValidasiyasi_3;

public class KocurmeValidasiya {
    static void kocurmeEt(double meblegh) {
        if (meblegh <= 0) {
            throw new IllegalArgumentException(
                    "Məbləğ müsbət olmalıdır. Daxil edilən: " + meblegh);
        }
        System.out.println("Köçürüldü: " + meblegh);
    }
}
