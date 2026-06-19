public class Task12 {

    public static void main(String[] args) {

        boolean a = true , b = false , c = true;

        System.out.println("a && b --> " + (a && b));         // false
        System.out.println("a && c --> " + (a && c));         // true
        System.out.println("a || b --> " + (a || b));         // true
        System.out.println("b || b --> " + (b || b));         // false
        System.out.println("!a --> " + (!a));                 // false
        System.out.println("!b --> " + (!b));                 // true
        System.out.println("a && !b --> " + (a && !b));       // true
        System.out.println("!a || b --> " + (!a || b));       // false
        System.out.println("(a || b) && c --> "
                + ((a || b) && c));                         // true
        System.out.println("!(a && c) --> " + (!(a && c)));   // false
    }
}