public class Task8 {

    public static void main(String[] args) {

        double celsius1 = 0;
        double fahrenheit1 = celsius1 * 9.0 / 5 + 32;

        double celsius2 = 100;
        double fahrenheit2 = celsius2 * 9.0 / 5 + 32;

        double celsius3 = 37;
        double fahrenheit3 = celsius3 * 9.0 / 5 + 32;

        System.out.println("0°C = " + fahrenheit1 + "°F");
        System.out.println("100°C = " + fahrenheit2 + "°F");
        System.out.println("37°C = " + fahrenheit3 + "°F");

        int c = 100;

        double sehvVariant = c * (9 / 5) + 32;
        // 9 / 5 int bölmədir və nəticə 1 olur:
        // 100 * 1 + 32 = 132

        double duzgunVariant = c * (9.0 / 5) + 32;
        // 9.0 / 5 double bölmədir və nəticə 1.8 olur:
        // 100 * 1.8 + 32 = 212

        System.out.println("Səhv variant: " + sehvVariant);
        System.out.println("Düzgün variant: " + duzgunVariant);
    }
}