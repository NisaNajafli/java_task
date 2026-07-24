package SenedTask6;

class PDFSened extends Sened {
    public PDFSened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println("PDF sənəd çap olunur: " + baslik);
    }
}
