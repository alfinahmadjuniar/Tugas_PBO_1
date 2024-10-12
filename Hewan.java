class Hewan {
    private String nama;

    public Hewan() {
        this.nama = "Tidak diketahui";
    }

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}
