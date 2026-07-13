package m4hw7;
import java.util.Scanner;

public class Task6 {
    public static void run(Scanner sc) {

        System.out.println("Task6");
        System.out.print("Uçuş kodunun ilk 2 hərfini daxil et: ");
        String kod = sc.next();

        String aviasirket;

        switch (kod) {
            case "AZ":
                aviasirket = "Azerbaijan Airlines";
                break;
            case "TK":
                aviasirket = "Turkish Airlines";
                break;
            case "QR":
                aviasirket = "Qatar Airways";
                break;
            default:
                aviasirket = "Naməlum aviaşirkət";
                break;
        }

        System.out.println(aviasirket);

    }
}
