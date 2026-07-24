package SenedTask6;

public class Main {
    public static void main(String[] args) {
        PDFSened p = new PDFSened("Müqavilə.pdf");
        p.capEt();

        WordSened w = new WordSened("Hesabat.docx");
        w.capEt();
    }
}
