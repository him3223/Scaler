public class Solution3 {
    public static int maxArea(int[] A) {
        int a = 0;
        int len = A.length;
        int b = len - 1;
        int ans = 0;
        while (a<b) {
            ans = Math.max(ans,Math.min(A[a],A[b])*(b-a));
            if (A[a]<A[b]) a++;
            else b--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1, 5, 4, 3};
        System.out.println("Maximum water container area: " + maxArea(height));
    }
}
