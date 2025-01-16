public class Solution {
    public int solve(int[] A) {
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
}