import java.util.HashSet;
public class Solution {
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
        int[] A = {4,2,-3,1};
        System.out.println(solve(A));
    }
}
