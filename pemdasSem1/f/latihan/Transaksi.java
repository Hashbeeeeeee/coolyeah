package latihan;

public class Transaksi {
    private String idPsn;
    private Menu menu;
    private int jumlah;
    // private double totalBayar;

    public Transaksi (String id, Menu menu, int jumlah){
        // this.idPsn = id;
        // this.menu = menu;
        // this.jumlah = jumlah;
        setId(id);
        setMenu(menu);
        setJumlah(jumlah);
    }

    public void setId (String id){
        this.idPsn = id;
    }
    public String getId (){
        return idPsn;
    }
    public void setJumlah (int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah (){
        return jumlah;
    }
    public Menu getMenu (){
        return menu;
    }
    public void setMenu (Menu menu){
        this.menu = menu;
    }
    public double getTotBayar (){
        return jumlah * menu.getHarga();
    }
}
