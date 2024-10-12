import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("===== INPUT =====");
        System.out.println();

        System.out.print("Masukkan nama kucing: ");
        String namaKucing = input.nextLine();
        System.out.print("Masukkan ras kucing: ");
        String rasKucing = input.nextLine();

        System.out.print("Masukkan nama ayam: ");
        String namaAyam = input.nextLine();
        System.out.print("Masukkan ras ayam: ");
        String rasAyam = input.nextLine();

        System.out.print("Masukkan nama burung: ");
        String namaBurung = input.nextLine();
        System.out.print("Masukkan warna bulu burung: ");
        String warnaBurung = input.nextLine();

        System.out.print("Masukkan jenis pohon: ");
        String jenisPohon = input.nextLine();
        System.out.print("Masukkan tinggi pohon: ");
        int tinggiPohon = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jenis bunga: ");
        String jenisBunga = input.nextLine();
        System.out.print("Masukkan warna bunga: ");
        String warnaBunga = input.nextLine();

        System.out.print("Masukkan jenis rumput: ");
        String jenisRumput = input.nextLine();



        System.out.println();
        System.out.println("======= Output =======");
        System.out.println();

        Hewan kucing = new Kucing(namaKucing, rasKucing);
        Hewan ayam = new Ayam(namaAyam, rasAyam);
        Hewan burung = new Burung(namaBurung, warnaBurung);

        System.out.println("nama kucing saya " + kucing.getNama() + ", rasnya " + ((Kucing)kucing).getRas());
        kucing.suara();
        
        System.out.println("nama ayam saya " + ayam.getNama() + ", rasnya " + ((Ayam)ayam).getRas());
        ayam.suara();

        System.out.println("nama burung saya " + burung.getNama() + ", Warna Bulu: " + ((Burung)burung).getWarnaBulu());
        burung.suara();

        System.out.println();
        Tumbuhan pohon = new Pohon(jenisPohon, tinggiPohon);
        Tumbuhan bunga = new Bunga(jenisBunga, warnaBunga);
        Tumbuhan rumput = new Rumput(jenisRumput);

        System.out.println("saya menanam pohon " + pohon.getJenis() + ", tingginya " + ((Pohon)pohon).getTinggi() + " meter");
        pohon.fotosintesis();

        System.out.println("saya menanam bunga " + bunga.getJenis() + ", warnanya " + ((Bunga)bunga).getWarna());
        bunga.fotosintesis();

        System.out.println("saya memotong rumput " + rumput.getJenis());
        rumput.fotosintesis();
    }
}
