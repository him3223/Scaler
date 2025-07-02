import java.util.*;

public class PairsWGDiff3 {

    public static int countPairsWithDiff(int[] arr, int k) {
        int a = 0;
        int b = 1;
        int count = 0;
        int len = arr.length;
        int diff = 0;
        while (b<len) {
            diff = arr[1]-arr[0];
            if (diff == k) {
                count++;
                a++;
                b++;
            }
            else if (diff<k) b++;
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
