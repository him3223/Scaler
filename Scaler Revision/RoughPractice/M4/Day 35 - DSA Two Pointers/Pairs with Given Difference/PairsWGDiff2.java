import java.util.*;

public class PairsWGDiff2 {

    public static int countPairsWithDiff(int[] arr, int K) {
        int a = 0;
        int b = 1;
        int len = arr.length;
        int count = 0;
        int diff = 0;
        while (b<len) {
            diff = arr[b]-arr[a];
            if (diff == K) {
                count++;
                a++;
                b++;
            }
            else if (diff<K){
                b++;
            }
            else {
                a++;
                if (a==b) b++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Pairs with difference " + k + ": " + countPairsWithDiff(arr, k));
    }
}
