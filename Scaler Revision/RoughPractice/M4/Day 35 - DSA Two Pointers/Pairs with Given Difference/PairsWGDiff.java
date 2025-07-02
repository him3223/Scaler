import java.util.*;

public class PairsWGDiff {

    public static int countPairsWithDiff(int[] arr, int k) {
        int a = 0, b = 1, count = 0;
        int n = arr.length;

        while (b < n) {
            int diff = arr[b] - arr[a];
            if (diff == k) {
                count++;
                a++;
                b++;
            } else if (diff < k) {
                b++;
            } else {
                a++;
                if (a == b) b++;
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
