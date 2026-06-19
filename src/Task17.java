public class Task17 {

    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));
        // true — mətnlər eynidir.

        System.out.println(s1.equals(s3));
        // false — equals() böyük və kiçik hərfləri fərqləndirir

        System.out.println(s1.equalsIgnoreCase(s3));
        // true — equalsIgnoreCase() böyük və kiçik hərfləri nəzərə almır

        System.out.println(s1.equals("  test  ".trim()));
        // true — trim() başlanğıc və sondakı boşluqları silir




        String s4 = new String("test");

        System.out.println(s1 == s2);
        // true — hər iki dəyişən String Pool-dakı eyni obyektə baxır.

        System.out.println(s1 == s4);
        // false — new String ayrıca yeni obyekt yaradır.
    }
}