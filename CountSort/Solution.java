import java.util.Arrays;
public class Solution {
    public static int[] solve(int[] A) {
        if (A == null || A.length == 0) return A;

        int min = A[0], max = A[0];
        // Find min and max value
        for (int num : A) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min + 1;
        int[] count = new int[range];

        // Count the frequency of each element
        for (int num : A) {
            count[num - min]++;
        }

        // Overwrite the input array with sorted elements
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                A[index++] = i + min;
            }
        }

        return A;
    }
    public static void main(String[] args) {
        int A[] = {3,9,7,2,4};
        System.out.println(Arrays.toString(solve(A)));
    }
}
