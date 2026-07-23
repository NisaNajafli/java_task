package HRTask1;

public class Menecer  extends Isci{
    int komandaSayi;

    public Menecer(String ad , int komandaSayi){
        super(ad);
        this.komandaSayi = komandaSayi;

    }
    @Override
    public void melumatGoster() {
        super.melumatGoster();
        System.out.println("Komanda sayı: " + komandaSayi);
    }
}
