package m4hw8;
import java.util.Scanner;

public class Task3 {
    public static void run(Scanner sc) {

        System.out.println("Task3");
        int number;
        do{
            System.out.println("Eded daxil edin: ");
            number = sc.nextInt();
            if (number < 0) {
                System.out.println("Yenidən daxil edin:");
            }
        } while(number < 0);
        System.out.println("Qəbul edildi:" + " " + number);
    }
}
