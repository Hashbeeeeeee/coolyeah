package method;

public class rekursif {
    public static void main(String[] args) {
        // angka(67);
        int hasil = factorial(4);
        System.out.println(hasil);
    }
    // public static void  angka (int a){
    //     System.out.println(a);
    //     byte loop = 0;
    //     while (true) {
    //         System.out.println(loop++);
    //     }
    //     return loop;
    //     angka(a++);
    // }
    public static int factorial (int n){
        if (n == 1) {        
            return 1;
        }
        return n * factorial(n - 1);
    }
}

