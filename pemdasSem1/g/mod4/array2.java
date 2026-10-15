package mod4;
import java.util.*;

public class array2 {
    public static void main(String[] args){
        String nama[] =new String[10];
        int coba [][] =  {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiRata2 = 0;
        System.out.println("i j coba [i][j]");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d %2d %3d\n", i, j, coba[i][j]);
                }
            }
            for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 3; j++) {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(bank[i][j] + " ");
            }
        } 
        System.out.println();

        double total = 0;
        for (int r = 0; r < coba.length; r++) {
            for (int c = 0; c < coba[r].length; c++) {
                total += coba[r][c];
            }
        }
        nilaiRata2 = total / (coba.length * coba[0].length);
        System.out.println("Nilai rata-rata array coba: " + nilaiRata2);

        double nilaiMin = bank[0][0];
        double nilaiMax = bank[0][0];
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length; j++) {
                if (bank[i][j] < nilaiMin) {
                    nilaiMin = bank[i][j];
                }
                if (bank[i][j] > nilaiMax) {
                    nilaiMax = bank[i][j];
                }
            }
        }  
        System.out.println("Nilai Minimum dari array bank: " + nilaiMin);
        System.out.println("Nilai Maksimum dari array bank: " + nilaiMax); 
    }
}