package oop;

public class Mhs {
    public String nim;
    public String nama;
    public char jenisKelamin;
    private String dompet;

    public Mhs(String nim, String nama, char jenisKelamin, String dompet){
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.dompet = dompet;
    }

    //setter method
    public void setDompet(String dompet){
        this.dompet = dompet;
    }

    //getter method
    public String getDompet(){
        return dompet;
    }

    public void info(){
        String jk;
        if (jenisKelamin == 'p') {
            jk = "perempuan";
        } else 
            jk = "pria jantan";
        System.out.printf("nama saya %s dengan nim %s berjenis kelamin %s", nama, nim, jk);
    }

    // public static void main(String[] args) {
    //     Mhs mahasiswa = new Mhs("8888", "jakwanbagung", 'l', "kosong");
    //     mahasiswa.info();
    // }
}
