package m4hw8;

public class Task11 {
    public static void run(){

        //int[] orijinal = {5, 10, 15, 20}; massivinin əsl kopyasını adi for ilə yarat (int[] b = a; yazmaq olmaz!).
        // Sonra kopyanın 0-cı elementini 99 et və hər iki massivi çap et. Orijinal massiv dəyişməməlidir.
        System.out.println("Task11");

        int[] orijinal = {5, 10, 15, 20};
        int[] copy = new int[orijinal.length];

        for(int i = 0; i<copy.length; i++){
            copy[i] = orijinal[i];
        }

        copy[0] = 99;

        System.out.println("Orijinal massiv:");
        for( int massiv1 : orijinal){
            System.out.println(massiv1);
        }
        System.out.println("Kopyalanmis massiv:");
        for( int massiv2 : copy){
            System.out.println(massiv2);
        }

    }
}
