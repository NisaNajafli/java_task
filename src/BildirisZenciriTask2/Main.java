package BildirisZenciriTask2;

public class Main {
    public static void main(String[] args) {
        Bildiris b = new Bildiris();
        EmailBildiris e = new EmailBildiris();
        TeciliEmailBildiris t = new TeciliEmailBildiris();

        b.gonder();
        System.out.println("---");
        e.gonder();
        System.out.println("---");
        t.gonder();
    
    }
}
