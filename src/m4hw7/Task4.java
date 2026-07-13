package m4hw7;
import java.util.Scanner;

public class Task4 {
    public static void run(Scanner sc) {

        System.out.println("Task4");
        String[] qacisciSirasi = {"1-ci", "2-ci", "3-cü"};

        int qacisciSayi = 3;
        int enSuretliNomre = 0;
        double enAzVaxt = 0;

        int i = 0;
        while (i < qacisciSayi) {
            System.out.print(qacisciSirasi[i] + " qaçışçının vaxtı: ");
            double vaxt = sc.nextDouble();

            if (i == 0 || vaxt < enAzVaxt) {
                enAzVaxt = vaxt;
                enSuretliNomre = i + 1;
            }

            i++;
        }

        System.out.println("Ən sürətli qaçışçı: " + qacisciSirasi[enSuretliNomre - 1] + " qaçışçı (nömrə: " + enSuretliNomre + ")");
        System.out.println("Vaxtı: " + enAzVaxt + " saniyə");
    }
}