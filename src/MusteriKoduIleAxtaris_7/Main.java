package MusteriKoduIleAxtaris_7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String , String> musteriler = new HashMap<>();

        musteriler.put("M001", "Anar Məmmədov");
        musteriler.put("M002", "Nisa Najafli");
        musteriler.put("M003", "Konul Atakisiyeva");
        musteriler.put("M004", "Yunis Memmedov");

        System.out.println("Bazadakı müştəri sayı: " + musteriler.size());

        Scanner sc = new Scanner(System.in);
        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = sc.nextLine();

        if (musteriler.containsKey(kod)) {
            String ad = musteriler.get(kod);
            System.out.println("Müştəri: " + ad);
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }

        sc.close();
    }
}
