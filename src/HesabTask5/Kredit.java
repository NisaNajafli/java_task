package HesabTask5;

public class Kredit extends Hesab{
    
    public Kredit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double faiz = getBalans() * 0.05;
        System.out.println("Kredit faizi (15%): " + faiz);
    }
}
