package mod6;

public class mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    String jenismobil;

    mobil(){
        this.jenismobil = "basssssss";
    }

    public void displayjenis(){
        System.out.println("jenis mobil ini: " + jenismobil );
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

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void displayMessage() {
        System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan" + kecepatan);
    }
}

