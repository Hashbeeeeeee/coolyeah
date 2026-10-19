package LK_05;

public class loop3 {
        public static void main(String[] args) {
        int n, i, j;

        n = 3;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
