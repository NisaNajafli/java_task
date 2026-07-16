package m4hw8;

public class Task12 {
    public static void main(String[] args){

        int[][] cedvel = {{3, 6, 9}, {12, 15, 18}};
        for (int i = 0; i < cedvel.length; i++) {
            for (int j = 0; j < cedvel[i].length; j++) {
                System.out.print(cedvel[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sətir sayı: " + cedvel.length);
        System.out.println("Sütun sayı: " + cedvel[0].length);

    }
}
