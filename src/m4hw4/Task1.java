package m4hw4;

import java.util.Scanner;
public class Task1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa a deyerini daxil edin :");
        int a = sc.nextInt();

        System.out.println("Zehmet olmasa b deyerini daxil edin :");
        int b = sc.nextInt();

        int toplama = a + b;
        int cixma = a - b;
        int vurma = a * b;
        int bolme = a / b;
        int qaliq = a % b;

        System.out.println("Toplama: " + toplama);
        System.out.println("Cixma: " + cixma);
        System.out.println("Vurma: " + vurma);
        System.out.println("Bolme: " + bolme);
        System.out.println("Qaliq: " + qaliq);

        /* Bolme neticesi tam ededdir, cunki 'a' ve 'b' int tipindedir.
           Javada eger hem bolunen hem de bolen int tipindedirse,
           netice de avtomatik olaraq int-e "kesilir" (truncate olunur) -
           yeni vergulden sonraki hisse tamamile atilir, yuvarlaqlasdirma aparilmir.
           Meselen: 17 / 5 = 3.4 olmalidir, amma int / int netice int oldugu
           ucun Java bunu 3-e qeder kesir.
           Eger tam decimal netice almaq isteyiriksə, deyisenlerden birini
           double-a cevirmek lazimdir, meselen:
           double bolmeDouble = (double) a / b; */
    }

}
