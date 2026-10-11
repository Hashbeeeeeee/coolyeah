package mod3;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        //disclaimer saya nyari tau gimana caranya biar bisa ngambil huruf pertama dari nama dan diubah ke uppercase, bukan AI (Trust me)
        char inisial = Character.toUpperCase(nama.charAt(0));

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {            
                if (j == 0 || j == 4 || i == 2) {
                    System.out.print(inisial + " ");
                } else {
                    System.out.print("  ");
                }        
            }
            System.out.println();
        }
    }
}
