package latihan;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("1. rumus luas persegi");
            System.out.println("2. luas permukaan bangun kubus");
            pilih = in.nextInt();

            int s1 = in.nextInt();
            int s2 = in.nextInt();
            switch (pilih) {
                case 1:
                    lPersegi(s1, s2);
                    System.out.println();
                    break;               
                case 2:
                    lkubus(s1, s2);
                    System.out.println();
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");
                    break;
            }
            
        } while (pilih != 3);   
    }

    public static int lPersegi (int sisi1, int sisi2){
        int hasil = sisi1 * sisi2;
        // System.out.println(hasil);
        return hasil;
    }

    public static int lkubus (int sisi1, int sisi2){
        int hasill = 6 * lPersegi(sisi1, sisi2); 
        System.out.println(hasill);
        return hasill;
    }

}
