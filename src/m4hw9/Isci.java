package m4hw9;

public class Isci {
    private String ad;

    public Isci(String isciAdi) {
        ad = isciAdi;
    }

    public String getAd() {
        return ad;
    }

    public void ozunuTeqdimEt() {
        System.out.println("Salam, mənim adım " + ad);
    }
}
