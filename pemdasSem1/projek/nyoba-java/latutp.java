import java.util.*;
public class latutp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan jumlah rute: ");
        int n = in.nextInt();
        int penumpang [][] = new int[n][5];
        int totpnp [] = new int [n];
        int total, terbesar, terendah;
        String bus;

        for (int i = 0; i < n; i++){
            System.out.println("masukan jumlah penumpang rute " + (i + 1));
            for (int j = 0; j < 5; j++){
                penumpang [i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf("%4d", penumpang[i][j]);
            }
            System.out.println();
        }
        System.out.println();
       
        for (int i = 0; i < n; i++){
            terbesar = 0;
            terendah = 999999999;
            for (int j = 0; j < 5; j++){
                if (penumpang [i][j] > terbesar) {
                    terbesar = penumpang [i][j];
                }
                if (penumpang [i][j] < terendah) {
                    terendah = penumpang [i][j];
                }
            }
            System.out.println("penumpang maks rute " + (i+1) + " adalah " + terbesar);
            System.out.println("penumpang min rute " + (i+1) + " adalah " + terendah);
        }
        for (int i = 0; i < n; i++){
            total = 0;
            for (int j = 0; j < 5; j++){
                total = total + penumpang[i][j]; 
                totpnp[i] = total;
            }
            if (total > 1500) {
                bus = "articulated bus";
            } else if (total >=800 && total <= 1500) {
                bus = "reguler";
            } else 
                bus = "minibus";
            System.out.println("total penumpang rute " + (i + 1) + " " + totpnp[i] + " | " + "Alokasi bus: " + bus);
        } 
    }
}
