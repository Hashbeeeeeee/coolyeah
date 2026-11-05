package mod5;

import java.util.Scanner;

public class prak2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang diinginkan: ");
        int angka = in.nextInt();

        if (cekPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        System.out.println("\nBilangan prima dari 1 - 100:");
        for (int i = 1; i <= 100; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }
        int pembagi = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                pembagi++;
            }
        }
        return pembagi == 2;
    }
}
