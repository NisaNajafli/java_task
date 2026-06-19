public class Task14 {

    public static void main(String[] args) {

        int n = 84;

        boolean cutEdeddir = n % 2 == 0;
        boolean musbetEdeddir = n > 0;
        boolean uceBolunur = n % 3 == 0;
        boolean yeddiyeBolunur = n % 7 == 0;
        boolean herIkisineBolunur = uceBolunur && yeddiyeBolunur;
        boolean araliqdadir = n > 10 && n < 100;

        System.out.println("84 cüt ədəddir: " + cutEdeddir);
        System.out.println("84 müsbət ədəddir: " + musbetEdeddir);
        System.out.println("84 3-ə bölünür: " + uceBolunur);
        System.out.println("84 7-yə bölünür: " + yeddiyeBolunur);
        System.out.println("84 həm 3-ə, həm 7-yə bölünür: " + herIkisineBolunur);
        System.out.println("84 10-dan böyük, 100-dən kiçikdir: " + araliqdadir);


        n = 105;

        cutEdeddir = n % 2 == 0;
        musbetEdeddir = n > 0;
        uceBolunur = n % 3 == 0;
        yeddiyeBolunur = n % 7 == 0;
        herIkisineBolunur = uceBolunur && yeddiyeBolunur;
        araliqdadir = n > 10 && n < 100;

        System.out.println("\n105 cüt ədəddir: " + cutEdeddir);
        System.out.println("105 müsbət ədəddir: " + musbetEdeddir);
        System.out.println("105 3-ə bölünür: " + uceBolunur);
        System.out.println("105 7-yə bölünür: " + yeddiyeBolunur);
        System.out.println("105 həm 3-ə, həm 7-yə bölünür: " + herIkisineBolunur);
        System.out.println("105 10-dan böyük, 100-dən kiçikdir: " + araliqdadir);
    }
}