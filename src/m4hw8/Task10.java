package m4hw8;

public class Task10 {
    public static void run(){

        System.out.println("Task10");
        int[] ballar = {45, 78, 92, 30, 65, 88};
        int min = ballar[0];
        int index = 0;
        for(int i = 0; i<ballar.length ; i++){
            if(ballar[i] < min){
                min = ballar[i];
                index = i;
            }
        }
        System.out.println("Ən kiçik bal: " + min + ", indeks: " + index);
    }
}
