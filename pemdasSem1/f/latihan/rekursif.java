package latihan;

public class rekursif {
    public static void main(String[] args) {   
        System.out.println(pangkat(2, 3));
        System.out.println(deret(5));
    }

    public static int perkalian(int a, int b) {
        if (a == 1) {
            return b;
        }
        return b + perkalian(b,a-1);
    }

    public static int deret(int a) {
        if (a == 1) {
            return 1;
        }
        return a + deret(a-1);
    }
    public static int jumdig(int a) {
        if (a == 1) {
            return 1;
        }
        return a + jumdig(a-1);
    }

    public static int fibonacci(int a) {
        if (a == 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);  // return itu ibarat kaya deklarasi variabel (fib = (a-1)+(a-2))     
    }   

    public static int pangkat(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pangkat (a, b-1); //a adalah base, b adalah pangkatnya. (2(2(2(2)))) a=2,b=4
    }   
}
