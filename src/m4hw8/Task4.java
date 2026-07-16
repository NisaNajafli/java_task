package m4hw8;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Scanner ilə istifadəçidən bir-bir ədədlər al. İstifadəçi 0 daxil edənə qədər ədədləri
        // cəmlə (0 özü cəmə daxil deyil). Sonda cəmi Cəm: X formatında çap et.

        Scanner sc = new Scanner(System.in);
        int number;
        int cem =0;
        do {
            System.out.println("Eded daxil edin: ");
            number = sc.nextInt();
            if(number  != 0){
                cem+=number;
            }
        }while(number!=0);
        System.out.println("Cəm:" + cem);
    }
}
