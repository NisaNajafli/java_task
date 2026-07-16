package m4hw8;

public class Task9 {
    public static void run(){

        System.out.println("Task9");
        int[] ededler = new int[8];
        for(int i = 0; i<ededler.length ; i++){
            ededler[i] = (i + 1)*10;
        }
        for(int eded : ededler){
            System.out.println(eded);
        }
    }
}
