package mod6;

public class mainmobil {
    public static void main(String[] args) {
        // instansiasi objek bernama m1
        mobil m1 = new mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();
        System.out.println("----------");

        // instansiasi objek bernama m2
        mobil m2 = new mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Biru");
        m2.displayMessage();
        System.out.println("---------");
        System.out.println("Atribut pada objek m1 diubah.");
        
        // mengubah warna dari objek m1
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
