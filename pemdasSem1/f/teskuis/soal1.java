package teskuis;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan nilai n ");
        int n = in.nextInt();
        for (int nilai = 1; nilai <= n; nilai++){
            if (nilai %3 == 0 || nilai %5 == 0) {
                System.out.println(nilai);
            }
        }
    }
}
