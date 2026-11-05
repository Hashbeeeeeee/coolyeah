package mod5;

import java.util.Scanner;

public class prak1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nilai n : ");
                int n = in.nextInt();
                System.out.print("Masukkan nilai r : ");
                int r = in.nextInt();

                long hasil = hitungPermutasi(n, r);

                System.out.println("         n");
                System.out.println("nPr = ------- = " + hasil);
                System.out.println("      (n-r)!");
                System.out.println("Maka Hasil Permutasinya adalah : " + hasil + "\n");

            } else if (pilihan == 2) {
                System.out.print("Masukkan nilai n : ");
                int n = in.nextInt();
                System.out.print("Masukkan nilai r : ");
                int r = in.nextInt();

                long hasil = hitungKombinasi(n, r);

                System.out.println("           n");
                System.out.println("nCr = ------------ = " + hasil);
                System.out.println("      (n-r)! x r!");
                System.out.println("Maka Hasil Kombinasinya adalah : " + hasil + "\n");
            }

        } while (pilihan != 3);
    }

    public static long faktorial(int angka) {
        long hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

    public static long hitungPermutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    public static long hitungKombinasi(int n, int r) {
        return faktorial(n) / (faktorial(n - r) * faktorial(r));
    }
}
