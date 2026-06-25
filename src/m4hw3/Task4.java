package m4hw3;

public class Task4 {

    public static void main(String[] args) {

        int a = 15, b = 40;
        int temp = a; // temp-e a-nin deyeri verilir => temp = 15
        a = b;        // a-ya b-nin deyeri verilir => a = 40
        b = temp;     // b-ye temp-in deyeri verilir => b = 15

        System.out.println("a = " + a); // a = 40
        System.out.println("b = " + b); // b = 15

    }

}