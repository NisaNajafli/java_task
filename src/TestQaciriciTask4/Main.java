package TestQaciriciTask4;

public class Main {
    public static void main(String[] args) {
        Test[] testler = new Test[3];
        testler[0] = new UITest();
        testler[1] = new APITest();
        testler[2] = new DBTest();

        for (Test t : testler) {
            t.icraEt();
        }
    }
}