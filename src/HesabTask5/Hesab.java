package HesabTask5;

abstract class Hesab {

    private double balans;
    
    public double getBalans() {
        return balans;
    }

    public Hesab(double balans) {
        this.balans = balans;
    }

    public void balansGoster() {
        System.out.println("Cari balans: " + balans);
    }

    public abstract void faizHesabla();

}
