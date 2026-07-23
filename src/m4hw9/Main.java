package m4hw9;

public class Main {

    public static void main(String[] args) {

        // ===== 1-ci task: Telefon =====
        Telefon telefon = new Telefon(80);

        telefon.setBateriyaFaizi(45);
        telefon.setBateriyaFaizi(-10);
        telefon.setBateriyaFaizi(150);
        telefon.setBateriyaFaizi(70);

        System.out.println("Son bateriya faizi: " + telefon.getBateriyaFaizi());

        System.out.println("--------------------------");

        // ===== 2-ci task: Telebe =====
        Telebe telebe1 = new Telebe("Nisa", 95);
        Telebe telebe2 = new Telebe("Kamran", 40);

        System.out.println(telebe1.melumatCap());
        System.out.println(telebe2.melumatCap());

        System.out.println("--------------------------");

        // ===== 3-cü task: Isci / Menecer / Developer =====
        Menecer menecer = new Menecer("Nisa");
        menecer.ozunuTeqdimEt(); // Isci-dən miras
        menecer.isGor();         // öz metodu

        Developer developer = new Developer("Elvin");
        developer.ozunuTeqdimEt(); // Isci-dən miras
        developer.isGor();          // öz metodu

        System.out.println("--------------------------");

        // ===== 4-cü task: Hesab / EmanetHesabi =====
        EmanetHesabi hesab = new EmanetHesabi("Kamran", 1000, 5);
        hesab.balansArtir(200);   // mədaxil
        hesab.faiziTetbiqEt();    // faiz tətbiqi
        System.out.println("Son balans: " + hesab.getBalans());

        System.out.println("--------------------------");

        // ===== 5-ci task: Kalkulyator (overloading) =====
        Kalkulyator kalkulyator = new Kalkulyator();
        System.out.println(kalkulyator.vur(4, 5));
        System.out.println(kalkulyator.vur(2, 3, 4));
        System.out.println(kalkulyator.vur(2.5, 3.0));

        System.out.println("--------------------------");

        // ===== 6-cı task: Bildiris (overriding, ata tipli massiv) =====
        Bildiris[] bildirisler = new Bildiris[3];
        bildirisler[0] = new EmailBildiris();
        bildirisler[1] = new SmsBildiris();
        bildirisler[2] = new PushBildiris();

        int i = 0;
        while (i < bildirisler.length) {
            bildirisler[i].gonder();
            i++;
        }

        System.out.println("--------------------------");

        // ===== 7-ci task: KofeMasini (abstraction) =====
        KofeMasini kofeMasini = new KofeMasini();
        kofeMasini.kofeHazirla();

        System.out.println("--------------------------");

        // ===== 8-ci task: Bankomat (abstraction) =====
        Bankomat bankomat = new Bankomat(500);
        bankomat.pulCek(700); // uğursuz — balans kifayət etmir
        bankomat.pulCek(200); // uğurlu
    }
}