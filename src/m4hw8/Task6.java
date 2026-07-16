package m4hw8;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] adlar = {"Aysel", "Murad", "Leyla", "Tural"};

        for(String ad : adlar){
            System.out.println("Salam, " + ad + "!");
        }
    }
}
