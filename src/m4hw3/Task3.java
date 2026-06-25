package m4hw3;

public class Task3 {

    public void run() {

        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println(a + b);           // iki int toplanir => 8 + 3 = 11
        System.out.println(a - b * 2);       // evvelce b*2=6, sonra 8-6 = 2
        System.out.println(a / b);           // tam bolme: 8 / 3 = 2 (qaliq atilir)
        System.out.println(a % b);           // qaliq: 8 % 3 = 2
        System.out.println(p && q);          // && ikiside true olmalidir: true && false = false
        System.out.println(p || q);          // || biri true olsa kifayet edir: true || false = true
        System.out.println(!p && !q);        // !true=false, !false=true => false && true = false
        System.out.println(a > 5 || b > 5);  // 8>5=true, 3>5=false => true || false = true
        System.out.println(s + a + b);       // string ilk oldugu ucun her sey string-e cevrilir, toplanmır: "QA"+8+3 = "QA83"
        System.out.println(a + b + s);       // evvelde iki int toplanir, sonra String-e birlesir: 11+"QA" = "11QA"

    }

}