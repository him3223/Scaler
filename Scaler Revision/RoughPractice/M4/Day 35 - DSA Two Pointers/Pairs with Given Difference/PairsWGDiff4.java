import java.util.*;

public class PairsWGDiff4 {

    public static int countPairsWithDiff(int[] arr, int k) {
        int a = 0;
        int b = 1;
        int count = 0;
        int diff = 0;
        int len = arr.length;
        while (b<len) {
            diff = arr[b]-arr[a];
            if (diff==k) {
                count++;
                b++;
                a++;
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
