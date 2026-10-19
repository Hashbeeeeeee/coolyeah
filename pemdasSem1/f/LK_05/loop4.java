package LK_05;

public class loop4 {
    public static void main(String[] args) {
        int n, i, j;

        n = 3;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
