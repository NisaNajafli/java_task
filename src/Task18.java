public class Task18 {

    public static void main(String[] args) {

        String tamAd = "leyla hüseynova";

        int bosluqYeri = tamAd.indexOf(" ");

        String ad = tamAd.substring(0, bosluqYeri);
        String soyad = tamAd.substring(bosluqYeri + 1);

        String duzelmisAd =
                ad.substring(0, 1).toUpperCase()
                        + ad.substring(1);

        String duzelmisSoyad =
                soyad.substring(0, 1).toUpperCase()
                        + soyad.substring(1);

        String duzelmisTamAd = duzelmisAd + " " + duzelmisSoyad;

        System.out.println("Baş hərfləri böyük: " + duzelmisTamAd);
        System.out.println("Ümumi uzunluq: " + tamAd.length());
        System.out.println("Adın ilk 5 hərfi: " + tamAd.substring(0, 5));
        System.out.println("Boşluq mövcuddur: " + tamAd.contains(" "));
        System.out.println("\"leyla\" ilə başlayır: " + tamAd.startsWith("leyla"));
        System.out.println("Bütün hərflər böyük: " + tamAd.toUpperCase());
    }
}