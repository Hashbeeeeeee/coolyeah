package oop;

class Rumah {
    public String warna;
    public int luas;
    public String blok;
    public String warnaPintu = "hitam legam";

    public Rumah(){ //default constructor, jika isinya kosong maka menjadi constructor namun implisit
        System.out.println("cihuy");
    }
    
    public Rumah(String warna){ //constructor overload
        warna = "merah";
        this.warna = warna;
        System.out.println("warna: " + this.warna);
    }

    public void bukaPintu() {
        String warnaPintu = "hitam";
        System.out.println("buka pintu yang " + this.warnaPintu); //this buat ambil var global
    }
    public void mengunci() {
        System.out.println("kunci");
    }

}
