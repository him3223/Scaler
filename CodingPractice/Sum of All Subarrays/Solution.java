public class Solution {
    public static long subarraySum(int[] A) {
        int len = A.length;
        long totalSum = 0;
        
        for (int a = 0; a < len; a++) {
            long contrabutaon = (long) A[a] * (a + 1) * (len - a);
            totalSum += contrabutaon;
        }
        
        return totalSum;
    }
    public static void main(String[] args) {
        int[] A = {2,4,6};
        System.out.println(subarraySum(A));
    }
}

