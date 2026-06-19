public class Task2 {

    public static void main(String[] args) {

        int bal = 1000;
        System.out.println("Başlanğıc: " + bal);

        bal = bal + 500; // 500 əlavə et
        System.out.println("500 əlavə: " + bal); // → 1500

        bal -= 200; // 200 çıx
        System.out.println("200 çıxdı: " + bal); // → 1300

        bal *= 2; // 2-yə vur
        System.out.println("2 vuruldu: " + bal); // → 2600

        bal /= 4;
        System.out.println("4-ə bölündü: " + bal); // → 650
    }
}
