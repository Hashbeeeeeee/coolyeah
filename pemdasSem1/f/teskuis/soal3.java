package teskuis;
import java.util.*;
public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan volume air (dalam ml): ");
        int vol = in.nextInt();
        int susut = 200;
        int menit = 0;
        while (vol > 500) {
            vol = vol - susut;
            menit = menit + 15;
            System.out.println("sisa air di menit " + menit + ": " + vol);
            if (vol <500) {
                System.out.println("[PERINGATAN] Air sudah dibawah 500 ml, segera tambah air agar dandang tidak gosong");
            }
        }
    }
}
