class Tumbuhan {
    private String jenis;

    public Tumbuhan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void fotosintesis() {
        System.out.println("Tumbuhan melakukan fotosintesis");
    }
}
