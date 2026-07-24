package SenedTask6;

class WordSened extends Sened {
    public WordSened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println("Word sənəd çap olunur: " + baslik);
    }
}

