package m4hw4;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zehmet olmasa email daxil edin :");
        String email = sc.next();

        boolean atVarmi = email.contains("@");
        boolean noqteVarmi = email.contains(".");
        boolean atdanEvvelKifayetVarmi = email.indexOf("@") >= 2;

        System.out.println("Email: " + email);
        System.out.println("\"@\" varmi: " + atVarmi);
        System.out.println("\".\" varmi: " + noqteVarmi);
        System.out.println("\"@\"-den evvel en azi 2 simvol varmi: " + atdanEvvelKifayetVarmi);
    }
}