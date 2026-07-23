package m4hw9;

public class Telebe {
    private String ad;
    private int bal;

    public Telebe(String telebeAdi, int telebeBali) {
        ad = telebeAdi;
        setBal(telebeBali);
    }

    public void setBal(int qiymet) {
        if (qiymet <= 0 || qiymet >= 100) {
            System.out.println("Xəta: bal 0-100 aralığında olmalıdır! (daxil edilən: " + qiymet + ")");
        } else {
            bal = qiymet;
        }
    }

    public int getBal() {
        return bal;
    }

    public String getAd() {
        return ad;
    }

    public String getQiymet() {
        if (bal >= 90) {
            return "Əla";
        } else if (bal >= 70) {
            return "Yaxşı";
        } else if (bal >= 50) {
            return "Kafi";
        } else {
            return "Qeyri-kafi";
        }
    }

    public String melumatCap() {
        return "Ad: " + ad + ", Bal: " + bal + ", Qiymət: " + getQiymet();
    }
}
