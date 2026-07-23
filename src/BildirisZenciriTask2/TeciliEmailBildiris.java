package BildirisZenciriTask2;

public class TeciliEmailBildiris extends EmailBildiris{

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("TƏCİLİ! Email dərhal göndərildi.");
    }
}
