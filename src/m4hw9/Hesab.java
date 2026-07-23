package m4hw9;

public class Hesab {
    private String sahibAdi;
    private double balans;

    public Hesab(String hesabSahibi, double baslangicBalans) {
        sahibAdi = hesabSahibi;
        balans = baslangicBalans;
    }

    public void balansArtir(double meblegh) {
        balans = balans + meblegh;
    }

    public double getBalans() {
        return balans;
    }

    public String getSahibAdi() {
        return sahibAdi;
    }
}
