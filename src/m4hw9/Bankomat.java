package m4hw9;

public class Bankomat {
    private double balans;

    public Bankomat(double baslangicBalans) {
        balans = baslangicBalans;
    }

    public void pulCek(double meblegh) {
        if (yoxlamaEt(meblegh)) {
            balans = balans - meblegh;
            System.out.println("Çəkilən məbləğ: " + meblegh);
            System.out.println("Qalıq: " + balans);
        } else {
            System.out.println("İmtina: balans kifayət etmir.");
        }
    }

    private boolean yoxlamaEt(double meblegh) {
        return meblegh <= balans;
    }
}
