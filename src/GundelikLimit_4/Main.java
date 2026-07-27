package GundelikLimit_4;

public class Main {
    public static void main(String[] args) {

        GundelikLimit gundelik_limit = new GundelikLimit();

        // 1-ci hal — limitə uyğun
        System.out.println("Limitə uyğun:");
        try {
            gundelik_limit.nagdCixar(1500.0);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        // 2-ci hal — limiti aşır
        System.out.println("Limiti aşan");
        try {
            gundelik_limit.nagdCixar(2500.0);
        } catch (LimitKecildiException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        System.out.println("Sessiya bitdi");
    }
}
