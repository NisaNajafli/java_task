package FilialHesabati_8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> filiallar = new HashMap<>();

        filiallar.put("Nərimanov filialı", 145);
        filiallar.put("Yasamal filialı", 98);
        filiallar.put("Xətai filialı", 210);
        filiallar.put("Sumqayıt filialı", 76);

        System.out.println("Cüt sayı: " + filiallar.size());

        System.out.println("--- Filial hesabatı ---");
        for (String filial : filiallar.keySet()) {
            System.out.println(filial + " → " + filiallar.get(filial));
        }

        filiallar.remove("Sumqayıt filialı");

        System.out.println("--- Sumqayıt bağlandıqdan sonra ---");
        System.out.println("Cüt sayı: " + filiallar.size());

        for (String filial : filiallar.keySet()) {
            System.out.println(filial + " → " + filiallar.get(filial));
        }
    }
}
