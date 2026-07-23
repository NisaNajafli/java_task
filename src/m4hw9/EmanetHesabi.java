package m4hw9;

public class EmanetHesabi extends Hesab{
    private double faizDerecesi;

    public EmanetHesabi(String hesabSahibi, double baslangicBalans, double illikFaiz) {
        super(hesabSahibi, baslangicBalans);
        faizDerecesi = illikFaiz;
    }

    public void faiziTetbiqEt() {
        double faizMeblegi = getBalans() * faizDerecesi / 100;
        balansArtir(faizMeblegi);
    }
}
