class Bunga extends Tumbuhan {
    private String warna;

    public Bunga(String jenis, String warna) {
        super(jenis);
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void fotosintesis() {
        System.out.println("Bunga berfotosintesis");
    }
}
