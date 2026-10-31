package mod5;

import java.util.*;

public class metVoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
            }
        } while (pilih != 3);
    }

    private static void volPrismaSegitiga() {
        // Scanner in = new Scanner(System.in);
        // float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        // System.out.print("Masukkan nilai panjang alas :");
        // alas = in.nextFloat();
        // System.out.print("Masukkan nilai tinggi segitiga :");
        // tinggiSegitiga = in.nextFloat();
        // luas = (alas * tinggiSegitiga) / 2;
        // System.out.print("Masukkan nilai tinggi prisma :");
        // tinggiPrisma = in.nextFloat();
        // volume = (luas * tinggiPrisma);
        // System.out.println("Volume Prisma Segitiga :" + volume);
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi A : ");
        double a = in.nextDouble();
        System.out.print("Masukkan panjang sisi B : ");
        double b = in.nextDouble();
        System.out.print("Masukkan panjang sisi C : ");
        double c = in.nextDouble();
        double keliling = a + b + c;
        double s = keliling / 2;
        double nilaiDalamAkar = s * (s - a) * (s - b) * (s - c);
        double luas = nilaiDalamAkar / 2;
        double temp = 0;
        while (luas != temp) {
            temp = luas;
            luas = (nilaiDalamAkar / temp + temp) / 2;
        }
        System.out.printf("Keliling : %.2f\n", keliling);
        System.out.printf("Luas     : %.2f\n", luas);
    }

    static void volBalok() {
        // Scanner in = new Scanner(System.in);
        // float panjang, lebar, tinggi, volume;
        // System.out.print("Masukkan panjang balok : ");
        // panjang = in.nextFloat();
        // System.out.print("Masukkan lebar balok : ");
        // lebar = in.nextFloat();
        // System.out.print("Masukkan tinggi balok : ");
        // tinggi = in.nextFloat();
        // volume = panjang * lebar * tinggi;
        // System.out.println("Volume balok : " + volume);
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga siku-siku : ");
        double alas = in.nextDouble();
        System.out.print("Masukkan tinggi segitiga siku-siku : ");
        double tinggi = in.nextDouble();
        double kuadratTotal = (alas * alas) + (tinggi * tinggi);
        double sisiMiring = kuadratTotal / 2;
        double temp = 0;
        while (sisiMiring != temp) {
            temp = sisiMiring;
            sisiMiring = (kuadratTotal / temp + temp) / 2;
        }
        double luas = 0.5 * alas * tinggi;
        double keliling = alas + tinggi + sisiMiring;
        System.out.printf("Sisi Miring : %.2f", sisiMiring);
        System.out.printf("Luas        : %.2f", luas);
        System.out.printf("Keliling    : %.2f", keliling);
    }
}
