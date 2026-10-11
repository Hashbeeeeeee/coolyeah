package teskuis;
import java.util.*;
public class soal2 {
    public static void main(String[] args) {
        int harga;
        int total = 0;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("masukan harga barang");
            harga = in.nextInt();
            total = total + harga;
        } while( harga != 0);
        System.out.println("total belanja = " + total);
    }
}
