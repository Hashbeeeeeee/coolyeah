package LK_06;

import java.util.Scanner;

public class tabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tabel [][] = new int[10][10];
        System.out.print("masukan angka perkalian pertama (maks 10): ");
        int a = in.nextInt();
        System.out.print("masukan angka perkalian kedua (maks 10): ");
        int b = in.nextInt();
        System.out.println("Tabel perkalian");
        for (int i = 0; i < tabel.length; i++){
           for (int j = 0; j < tabel.length; j++){
                tabel [i][j] = (i+1) * (j+1);
                System.out.printf("%4d", tabel[i][j]);
            } 
            System.out.println();
        }
        System.out.println("hasil kali dari " + a + " dikali " + b + " adalah");
        System.out.println(tabel[a - 1][b - 1]);
        System.out.println("terdapat pada tabel index [" + (a - 1) + "] [" +  (b - 1) + "]");
    }
}
