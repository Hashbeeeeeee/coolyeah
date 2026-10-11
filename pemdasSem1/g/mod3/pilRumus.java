package mod3;

import java.util.Scanner;

public class pilRumus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vol, r;
        int pilihan;
        do{
            System.out.println("0. KELUAR");
            System.out.println("1. Vol Balok");
            System.out.println("2. Vol Bola");
            System.out.println("3. Vol Kerucut");
            System.out.println("4. Vol Silinder");
            System.out.println("5. Vol Limas Segitiga");
            System.out.println("masukan pilihan");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 0:
                    System.out.println("anda keluar");
                    break;

                case 1:
                    System.out.println("masukan panjang");
                    double p = in.nextInt();
                    System.out.println("masukan lebar");
                    double l = in.nextInt();
                    System.out.println("masukan tinggi");
                    double t = in.nextInt();
                    vol = p * l* t;
                    System.out.println("Volume balok = " + vol +"m³");
                    break;

                case 2:
                    System.out.println("Masukkan r: ");
                    r = in.nextInt(); 
                    if (r % 7 == 0) {
                        vol = (4/3 * 22/7 * (r * r * r));
                    }
                    else {
                        vol = (4/3 * 3.14 * (r * r * r));
                    }
                    System.out.println("Volume bola = " + vol+"m³");
                    break;

                case 3:
                    System.out.println("Masukkan r: ");
                    r = in.nextInt(); 
                    System.out.println("Masukkan t: ");
                    t = in.nextInt(); 
                    if (r % 7 == 0) {
                        vol = (1.0/3.0 * 22/7 * (r * r) * t);
                    }
                    else {
                        vol = (1.0/3.0 * 3.14 * (r * r) * t);
                    }
                    System.out.println("Volume kerucut = " + vol+"m³");
                    break;
                case 4:
                    System.out.println("Masukkan r: ");
                    r = in.nextInt(); 
                    System.out.println("Masukkan t: ");
                    t = in.nextInt(); 
                    if (r % 7 == 0) {
                        vol = (22/7 * (r * r) * t);
                    }
                    else {
                        vol = (3.14 * (r * r) * t);
                    }
                    System.out.println("Volume kerucut = " + vol+"m³");
                    break;
                case 5:
                    System.out.println("masukan alas segitiga");
                    double a = in.nextInt();
                    System.out.println("masukan tinggi segitiga (alas)");
                    double t1 = in.nextInt();
                    System.out.println("masukan tinggi limas");
                    double t2 = in.nextInt();
                    vol = 1.0/3.0 *(1.0/2.0 * a * t1) * t2;
                    System.out.println("Volume limas segitiga = " + vol+"m³");
                    break;
                default:
                    System.out.println("gaada pilihannya mas");
            }
        }while(pilihan!=0);

        in.close();
    }
}

