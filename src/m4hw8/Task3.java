package m4hw8;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
