package mod5;
import java.util.*;
public class metrek {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int bilangan = in.nextInt();
        int hasil;
        // int bilangan = 5;
        // hasil = faktorial(bilangan);
        // System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < bilangan; i++) {
            System.out.print(faktorial(i) + " ");
        }
    }
    
    private static int faktorial(int bil) {
        // if (bil == 1)
        //     return 1;
        // else
        //     return (bil * faktorial(bil - 1));
        if (bil == 0) {
            return 0;
        } else if (bil == 1) {
            return 1;
        } else {
            return faktorial(bil - 1) + faktorial(bil - 2);
        }
    }
}
