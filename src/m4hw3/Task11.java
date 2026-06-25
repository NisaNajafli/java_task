package m4hw3;

public class Task11 {

    public void run() {

        String parol = "Abb@2024" ;

        boolean uzunUygun = parol.length() >= 8;
        boolean xarakterVar = parol.contains("@");
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        boolean reqemVar = parol.contains("2024");
        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslayir && reqemVar ;

        System.out.println(gucluParol);

    }

}
