package KartSahibininAdi_2;

public class Main {

        static String kartSahibi;

        public static void main(String[] args) {
            System.out.println("--- 1-ci hal: null ---");
            adiYoxla();

            kartSahibi = "NISA NAJAFLI";

            System.out.println("--- 2-ci hal: real ad ---");
            adiYoxla();
        }

        static void adiYoxla() {
            try {
                int simvolSayi = kartSahibi.length();
                System.out.println("Kart sahibi: " + kartSahibi);
                System.out.println("Simvol sayı: " + simvolSayi);
            }catch (NullPointerException e) {
                System.out.println("Kart məlumatı tapılmadı");
            }finally {
                System.out.println("Sessiya bağlandı");
            }
        }



    }
