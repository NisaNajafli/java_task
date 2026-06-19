public class Task9 {

    public static void main(String[] args) {

        int sayi = 583;

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;
        int cem = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println("Yüzlər rəqəmi: " + yuzler);
        System.out.println("Onlar rəqəmi: " + onlar);
        System.out.println("Birlər rəqəmi: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);


        sayi = 907;  // 907 üçün yoxlama

        yuzler = sayi / 100;
        onlar = (sayi % 100) / 10;
        birler = sayi % 10;
        cem = yuzler + onlar + birler;

        System.out.println("\nƏdəd: " + sayi);
        System.out.println("Yüzlər rəqəmi: " + yuzler);
        System.out.println("Onlar rəqəmi: " + onlar);
        System.out.println("Birlər rəqəmi: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);
    }
}