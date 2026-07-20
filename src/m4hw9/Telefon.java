package m4hw9;

public class Telefon {
    private int bateriyaFaizi;

    public Telefon(int faiz) {
        setBateriyaFaizi(faiz);
    }

    public void setBateriyaFaizi(int faiz) {
        if (faiz <= 0 || faiz >= 100) {
            System.out.println("Xəta: bateriya faizi 0-100 aralığında olmalıdır! (daxil edilən: " + faiz + ")");
        } else {
            bateriyaFaizi = faiz;
        }
    }

    public int getBateriyaFaizi() {
        return bateriyaFaizi;
    }
}
