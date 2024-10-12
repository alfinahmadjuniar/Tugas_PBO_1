class Pohon extends Tumbuhan {
    private int tinggi;

    public Pohon(String jenis, int tinggi) {
        super(jenis);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void fotosintesis() {
        System.out.println("Pohon berfotosintesis");
    }
}
