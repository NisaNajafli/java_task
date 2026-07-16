package m4hw8;

public class Task8 {
    public static void run(){

        System.out.println("Task8");
        int[] ballar = {67, 91, 54, 88, 73};
        int max =ballar[0];
        for(int bal: ballar){
            if(bal>max){
                max=bal;
            }
        }
        System.out.println("En boyuk bal: " + max);
    }
}
