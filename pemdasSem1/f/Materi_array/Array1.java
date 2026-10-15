package Materi_array;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] cihuy = {67,67,67,67,67};
        int[] cihuyy = {44,36,17,88,67};
        int[] hasil = new int[cihuy.length];

        int total;
        //keduanya sama aja, yang membedakan adalah value dan length
        // System.out.println(cihuy[1]);
        // System.out.println(cihuyy[4]);
        for (int i = 0; i < cihuy.length; i++) {
            System.out.println(hasil[i] = cihuy[i] + cihuyy[i]);
            System.out.println(hasil[i]);
        }

        System.out.println( "batas");

        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i]+" ");
        }
    }
}
