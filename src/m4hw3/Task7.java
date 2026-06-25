package m4hw3;

public class Task7 {

    public static void main(String[] args) {

        double temp = 36.8;
        int suret = 95, yanacaq = 0;
        boolean aktiv = false;
        double balans = -50.0;
        String ad = "Anar";
        int yas = 22;


        boolean tempNormaldirmi   = temp > 36 && temp < 37.5;
        boolean suretVeyaYanacaqUygundurmu = (suret > 0 && suret < 120) || yanacaq > 0;
        boolean hesabProblemlidirmi    = !aktiv || balans < 0;
        boolean adVeYasGecerlidirmi    = ad.length() > 0 && yas > 18;

        System.out.println(tempNormaldirmi);        // true
        System.out.println(suretVeyaYanacaqUygundurmu);   // true
        System.out.println(hesabProblemlidirmi);         // true
        System.out.println(adVeYasGecerlidirmi);         // true

    }

}