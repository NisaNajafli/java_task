package KocurmeValidasiyasi_3;

public class Main {

    public static void main(String[] args) {
        KocurmeValidasiya kocurme = new KocurmeValidasiya();


        //Musbet deyer
        System.out.println("Musbet deyerle: ");
        try {
            kocurme.kocurmeEt(150.75);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        //Menfi deyer
        System.out.println("Menfi deyerle: ");

        try {
            kocurme.kocurmeEt(-40.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        System.out.println("Proqram davam edir");
    }
}
