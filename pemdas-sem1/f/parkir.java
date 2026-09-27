import java.util.Scanner;

public class parkir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double durasi;
        int jenisKend, civitas, drsblt;
        int tarifMtr = 2000, tarifMbl = 5000, tarifCiv = 2000, tarif = 0;
        // boolean civ;

        System.out.print("masukan durasi parkir: ");
        durasi = input.nextDouble();
        while (durasi<0) {
            System.out.println("durasi tidak valid");
            System.out.print("masukan durasi parkir:");
            durasi = input.nextDouble();
        }

        // System.out.print("masukan jenis kendaraan (1/2):");
        // jenisKend = input.nextInt(); 
        do {
            System.out.print("masukan jenis kendaraan (1/2):");
            jenisKend = input.nextInt();
            if (jenisKend != 1 && jenisKend != 2) {
                System.out.println("jenis kendaraan tidak valid");
            }
        }
        while (jenisKend != 1 && jenisKend != 2); 
        // {
        //     System.out.print("masukan jenis kendaraan (1/2)");
        //     jenisKend = input.nextInt(); 
        // }  
        
             
        System.out.print("apakah anda civitas? (tidak=0 ya=1):");
        civitas = input.nextInt();       
        while (civitas != 0 && civitas != 1) {
            System.out.println("input tidak valid");
            System.out.print("apakah anda civitas? (tidak=0 ya=1):");
            civitas = input.nextInt();
        }

        drsblt = (int) durasi;  
        if (durasi > drsblt) {
            durasi = drsblt + 1;
        }
        // if (jenisKend == 1) {
        //     tarif = tarifMtr + (durasi-1)*1000;       
        // }
        // else {
        //       tarif = tarifMbl + (durasi-1)*2000;       
        //     }
        // kode if ini sama kaya switch, cuma beda penggunaan
        switch (jenisKend) {
            case 1:
                tarif = tarifMtr + (drsblt-1)*1000;
                break;  
            default:
                 tarif = tarifMbl + (drsblt-1)*2000;       
                break;
        }

        if (durasi >24) {
            tarif = 50000 + tarif;
            System.out.println("anda mendapat denda 50.000");
        }
        
        if (civitas == 1) {
            tarif = tarifCiv;
            System.out.println("anda mendapatkan tarif flat");
        }
        
        System.out.println("total tarif= " + tarif); 
    }
}