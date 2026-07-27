package GundelikLimit_4;

public class GundelikLimit {
    static final double GUNDELIK_LIMIT = 2000.0;

    static void nagdCixar(double meblegh) throws LimitKecildiException {
        if (meblegh > GUNDELIK_LIMIT) {
            throw new LimitKecildiException(
                    "Gündəlik limit aşıldı. Limit: " + GUNDELIK_LIMIT + " AZN, tələb: " + meblegh + " AZN");
        }
        System.out.println("Nağd çıxarıldı: " + meblegh + " AZN");
    }
}
