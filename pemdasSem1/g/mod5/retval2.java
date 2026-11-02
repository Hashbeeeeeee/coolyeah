package mod5;
import java.util.*;
public class retval2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
        arr = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index ke " + (i + 1) + " : " + arr[i]);
        }
        System.out.println();
        int[] arr2 = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
        arr2 = sortBesarKeKecil(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Index ke " + (i + 1) + " : " + arr2[i]);
        }
    }

    private static int[] sort(int[] acak) {
        int bil1 = 0;
        int bil2 = 0;
        while (bil1 < acak.length) {
            bil2 = bil1;
            while (bil2 < acak.length) {
                if (acak[bil1] < acak[bil2]) {
                    int temp = acak[bil1];
                    acak[bil1] = acak[bil2];
                    acak[bil2] = temp;
                }
                bil2++;
            }
            bil1++;
        }
        return acak;
    }
    
    private static int[] sortBesarKeKecil(int[] acak) {
        int bil1 = 0;
        while (bil1 < acak.length) {
            int bil2 = bil1;
            while (bil2 < acak.length) {
                if (acak[bil1] > acak[bil2]) {
                    int temp = acak[bil1];
                    acak[bil1] = acak[bil2];
                    acak[bil2] = temp;
                }
                bil2++;
            }
            bil1++;
        }
        return acak;
    }
}
