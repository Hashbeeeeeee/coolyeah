package latihan;

public class Main {
    public static void main(String[] args) {
        Menu nasgor = new Menu("nasgor goreng", 15000);
        // nasgor.setNama("nasgor goreng");
        // nasgor.setHarga(15000);

        Transaksi t1 = new Transaksi("TDR-3000",nasgor, 2);
        // t1.setId("TDR-3000");
        // t1.setJumlah(2);
        // t1.setMenu(nasgor);
        System.out.printf(
            "Id Transaksi %s \n" +
            "Menu: %s \n"+
            "Harga: %.1f \n"+
            "Jumlah: %d \n"+
            "Total bayar: %.1f \n",
            t1.getId(),t1.getMenu().getNama(),t1.getMenu().getHarga(),t1.getJumlah(),t1.getTotBayar()
        );
    }
}
