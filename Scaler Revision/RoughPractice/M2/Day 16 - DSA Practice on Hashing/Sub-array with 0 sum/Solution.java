import java.util.*;
public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
    public static int solve(int[] A) {
        HashSet<Long> prefixSumSet = new HashSet<>();
        long prefixSum = 0;
        for (int num : A) {
            prefixSum += num;
            if (prefixSum == 0 || prefixSumSet.contains(prefixSum)) {
                return 1;
            }
            prefixSumSet.add(prefixSum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {2,-2};
        System.out.println(solve(A));
    }
}
