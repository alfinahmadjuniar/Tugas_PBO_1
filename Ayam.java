class Ayam extends Hewan {
    private String ras;

    public Ayam(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    public String getRas() {
        return this.ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void suara() {
        System.out.println("Ayam berkokok");
    }
}
