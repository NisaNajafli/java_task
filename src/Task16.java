public class Task16 {

    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";
        String temizMetn = metn.trim();

        int ilkinUzunluq = metn.length();
        int temizUzunluq = temizMetn.length();

        System.out.println("Mətnin uzunluğu: " + ilkinUzunluq);
        System.out.println("Boşluqlar silindikdən sonra uzunluq: " + temizUzunluq);
        System.out.println("Böyük hərflərlə: " + metn.toUpperCase());
        System.out.println("Kiçik hərflərlə: " + metn.toLowerCase());
        System.out.println("\"ABB\" sözü var: " + metn.contains("ABB"));
        System.out.println("\"bank\" sözü var: " + metn.contains("bank"));
        System.out.println("Dəyişdirilmiş mətn: " + metn.replace("Bank", "Kredit"));
        System.out.println("\"Salam\" ilə başlayır: " + temizMetn.startsWith("Salam"));
    }
}