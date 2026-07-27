package VIPMusteriNovbesi_5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> novbe = new ArrayList<>();

        // 4 müştəri
        novbe.add("Anar");
        novbe.add("Leyla");
        novbe.add("Kamran");
        novbe.add("Nigar");
        System.out.println("İlkin növbə: " + novbe);

        // VIP müştəri növbənin basina keçir
        novbe.add(0, "VIP Rəşad");
        System.out.println("VIP-dən sonra: " + novbe);

        // Konkret ad növbədədirmi?
        boolean varmi = novbe.contains("Kamran");
        System.out.println("Kamran növbədədir? " + varmi);

        // Bir müştərinin adı əvəz olunur
        novbe.set(2, "Səbinə");
        System.out.println("Əvəzdən sonra: " + novbe);

        // Adi for ilə çap
        System.out.println("--- Növbə siyahısı ---");
        for (
                int i = 0; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}
