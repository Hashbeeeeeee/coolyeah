package mod5;

import java.util.Scanner;

public class retval {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2;
        int tahunLahir1, tahunLahir2;
        System.out.println("Masukan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.println("Masukan Tahun Lahir Mahasiswa 1 (Contoh: 2004) : ");
        tahunLahir1 = in.nextInt();
        System.out.println("Masukan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.println("Masukan Tahun Lahir Mahasiswa 2 (Contoh: 2008) : ");
        tahunLahir2 = in.nextInt();

        int tahunSekarang = 2026;
        int umur1 = tahunSekarang - tahunLahir1;
        int umur2 = tahunSekarang - tahunLahir2;

        String status1, status2;
        
        if (umur1 > 20) {
            status1 = "Adult";
        } else {
            status1 = "teen";
        }

        if (umur2 > 20) {
            status2 = "Adult";
        } else {
            status2 = "teen";
        }

        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, umur1, status1));
        System.out.println(showData(nim2, nama2, jur2, umur2, status2));
    }
    public static String showData(String nim, String nama, String jurusan, int umur, String status) {
        String show = "\nnim : \n" + nim + "\nnama : \n" + nama + "\nJurusan : \n" + jurusan + "\nUmur    : " + umur + " tahun" + "\nStatus  : " + status;
        return show;
    }

}
