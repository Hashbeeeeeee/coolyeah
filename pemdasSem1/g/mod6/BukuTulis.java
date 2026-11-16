package mod6;

public class BukuTulis {
    private int jumlahLembar = 50;
    private int kataPerHari = 100;

    public double hitungLamaHabis() {
        int totalHalaman = jumlahLembar * 2;
        double halamanPerHari = kataPerHari / 200.0;
        return totalHalaman / halamanPerHari;
    }

    public static void main(String[] args) {
        BukuTulis b = new BukuTulis();
        System.out.println("Waktu menghabiskan buku: " + (int)b.hitungLamaHabis() + " hari");
    }
}
