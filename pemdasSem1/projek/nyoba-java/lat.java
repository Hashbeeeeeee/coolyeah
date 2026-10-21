import java.util.*;


public class lat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean status = false;
        int ayam = 25000, bebek = 35000, nasgor = 15000, total = 0, temp = 0, diskon = 0;
        String namaMenu = in.next();
        int jumlahPorsi = in.nextInt();
        String metodePembayaran = in.next();

        switch (namaMenu) {
            case "ayam":
                temp = ayam * jumlahPorsi;
                if (jumlahPorsi >= 5 && jumlahPorsi <10) {
                    diskon = (temp * 10)/100 ;
                }
                else if (jumlahPorsi >=10) {
                    diskon = (temp * 20)/100 ;
                }
                total = temp - diskon;
                break;

            case "bebek":
                temp = bebek * jumlahPorsi;
                if (jumlahPorsi >= 5 && jumlahPorsi <10) {
                    diskon = (temp * 10)/100 ;
                }
                else if (jumlahPorsi >=10) {
                    diskon = (temp * 20)/100 ;
                }
                total = temp - diskon;
                if (jumlahPorsi >= 3) {
                    status = true;
                }
                break;
              
            case "nasgor":
                temp = nasgor * jumlahPorsi;
                if (jumlahPorsi >= 5 && jumlahPorsi <10) {
                    diskon = (temp * 10)/100 ;
                }
                else if (jumlahPorsi >=10) {
                    diskon = (temp * 20)/100 ;
                }
                total = temp - diskon;
                if (total >=150000) {
                    status= true;
                }
                break;
            default:
                System.out.println("menu tidak ditemukan");
                break;
        }

        switch (metodePembayaran) {
            case "qris":
                if (total >= 100000) {
                    total = total - 15000;
                } else
                    total = total - 5000;
                break;

                case "kupon":
                if (jumlahPorsi >= 3) {
                    total = total - 15000;
                }
                break;

                case "tunai":
                    break;
            default:
                System.out.println("bayar yang bener");
                break;
        }
        System.out.println(total);
        if (status) {
            System.out.print("bonus esteh anget");
        }else
            System.out.println("gaada bonus wok");
    }
}
