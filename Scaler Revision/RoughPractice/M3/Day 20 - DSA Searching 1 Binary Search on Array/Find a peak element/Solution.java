public class Solution {
    public static int solve(int[] A) {
        int len = A.length;
        int l = 0, r = len-1, mid=0;
        while (l<r) {
            mid=(l+r)/2;
            if (A[mid]<A[mid+1])
                l=mid+1;
            else
                r=mid;
        }
        return A[l];
    }
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        System.out.println(solve(A));
    }
}