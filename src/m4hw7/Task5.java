package m4hw7;


public class Task5 {
    public static void run() {

        System.out.println("Task5");
        double ilkinQiymet = 1000;
        double qiymet = ilkinQiymet;
        double artimTempi = 0.08;

        double hedef = ilkinQiymet * 2;

        int il = 0;
        while (qiymet < hedef) {
            qiymet = qiymet * (1 + artimTempi);
            il++;

            System.out.printf("İl %d: %.2f AZN%n", il, qiymet);
        }

        System.out.println("Qiymət iki qatına " + il + " ilə çatdı");
    }
}
