package mod6;

public class mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setWaktu(double jam) {
        this.waktu = ubahSekon(jam);
    }
    private double ubahSekon(double jam) {
        return jam * 3600.0;
    }
    private double ubahKecepatan(double kmh) {
        return kmh * 1000.0 / 3600.0;
    }
    public double hitungJarak() {
        return kecepatan * waktu;
    }
    public void setKecepatan(int i) {
        this.kecepatan = (int) ubahKecepatan(i);
    }
    public void setNoPlat(String s) {
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void displayMessage() {
        System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("Jarak yang dapat ditempuh: " + (hitungJarak() / 1000.0) + " km");
    }
}