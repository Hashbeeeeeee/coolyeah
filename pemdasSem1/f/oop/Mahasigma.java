package oop;

public class Mahasigma {
    public String nama;
    public String nim;
    public char jenisKel;
    public String jk;

    public Mahasigma(){
        String jk;
        this.nama = "Hashbi Abdillah";
        this.nim = "262626262";
        this.jenisKel = 'c';
        if (jenisKel == 'p') {
            jk = "perempuan";
        }
        else if (jenisKel == 'l') {
            jk = "pria jantan";
        }
        else jk = "tidak sesuai";  

        this.jk = jk;
    }
}
