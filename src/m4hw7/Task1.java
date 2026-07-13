package m4hw7;

import java.util.Scanner;

public class Task1 {

    public static void run(Scanner sc) {

        System.out.println("Task1");

        // Havanın temperaturunu istifadəçidən alırıq
        System.out.print("Havanın temperaturunu daxil et (°C): ");
        int temperatur = sc.nextInt();

        String status;

        /*
            25-dən yuxarı → İsti
            15–25 → Mülayim
            0–14 → Soyuq
            0-dan aşağı → Şaxta
         */

        if (temperatur > 25) {
            status = "İsti";
        } else if (temperatur >= 15) {
            status = "Mülayim";
        } else if (temperatur >= 0) {
            status = "Soyuq";
        } else {
            status = "Şaxta";
        }

        System.out.println("Temperatur: " + temperatur + "°C → Status: " + status);
    }
}
