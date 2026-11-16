package latihan;

public class Menu {
    private String namaMenu;
    private double harga;

    public Menu (String nama, double harga){
        // this.namaMenu = nama;
        // this.harga = harga;
        setNama(nama);
        setHarga(harga);
    }
    public void setNama(String nama){
        this.namaMenu = nama;
    }
    public String getNama (){
        return namaMenu;
    } 
    public void setHarga(double harga){
        if (harga <= 0) {
            System.out.println("tidak boleh <=0");
            return;
        }
        this.harga = harga;
    }
    public double getHarga(){
        return harga;
    }
}
