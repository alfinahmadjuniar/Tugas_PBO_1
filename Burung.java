class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, String warnaBulu) {
        super(nama);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return this.warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public void suara() {
        System.out.println("Burung berkicau");
    }

}
