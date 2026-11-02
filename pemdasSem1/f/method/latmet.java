package method;

public class latmet {
    public static void main(String[] args) {
        int angka = 1111;
        ubahAngka(angka);
        System.out.println(angka);
        
        int[] arrAngka = {1111};
        System.out.println(arrAngka);
        ubahAngka2(arrAngka);
        System.out.println(arrAngka[0]);
    }
    
    public static void ubahAngka(int angka){
        angka = -999;
    }

    public static void ubahAngka2(int[] arrAngka){
        System.out.println(arrAngka);
        arrAngka[0] = -999;
    }
}
