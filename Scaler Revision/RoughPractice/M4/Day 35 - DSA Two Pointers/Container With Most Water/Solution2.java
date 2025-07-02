public class Solution2 {
    public static int maxArea(int[] A) {
        int a = 0;
        int len = A.length;
        int n = len -1;
        int ans = 0;
        while (a<n) {
            ans = Math.max(ans,Math.min(A[a],A[n])*(n-a));
            if (A[a]<A[n]) a++;
            else n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1, 5, 4, 3};
        System.out.println("Maximum water container area: " + maxArea(height));
    }
}
