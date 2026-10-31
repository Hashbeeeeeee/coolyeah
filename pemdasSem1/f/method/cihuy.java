package method;
public class cihuy {
    public static void main(String [] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 10;
        System.out.println(penjumlahan(perkalian(pengurangan(penjumlahan(a, b),c),d),e));
    }
    public static int penjumlahan(int a, int b) {
        int hasil = (a + b);
        return hasil;     
    }
    public static int pengurangan(int a, int b) {
        int hasil = (a - b); 
        return hasil;     
    }
    public static int perkalian(int a, int b) {
        int hasil = (a + b); 
        return hasil;     
    }
    public static int pembagian(int a, int b) {
        int hasil = (a + b); 
        return hasil;     
    }
    
}
