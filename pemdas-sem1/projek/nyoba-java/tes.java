import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kehadiran;

        System.out.println("persentase kehadiran");
        kehadiran = in.nextInt();

        while (kehadiran > 100 || kehadiran < 0) {
            System.out.println("masukan nilai antara 0-100");
            kehadiran = in.nextInt();
        }

        if (kehadiran >= 90) {
            System.out.println("Sangat baik");
        }
        else if (kehadiran >=80) {
            System.out.println("baik");
        }
        else if (kehadiran >= 70) {
            System.out.println("cukup");
        }
        else {
            System.out.println("Kurang");
        }
    }
}
