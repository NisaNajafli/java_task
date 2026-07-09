package m4hw6;

import java.util.Scanner;

public class Task6 {
    public static void run(Scanner sc) {


        System.out.println("Task6");
        System.out.println("Mobil nomrenin kod hissesini daxil edin: ");
        int kod = sc.nextInt();

        if (kod == 50 || kod == 51) {
            System.out.println("Operator: Azercell");
        } else if (kod == 55 || kod == 99) {
            System.out.println("Operator: Bakcell");
        } else if (kod == 70 || kod == 77) {
            System.out.println("Operator: Nar");
        } else {
            System.out.println("Namelum operator");
        }
    }
}