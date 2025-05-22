public class Solution3 {
    public static int solve(int[] A) {
        int len = A.length;
        int l =0;
        int r=len-1;
        int mid = 0;
        while (l<r) {
            mid = (l+r)/2;
            if (A[mid]<A[mid+1]) {
                l=mid+1;
            }
            else r=mid;
        }
        return A[l];
    }
    public static void main(String[] args) {
        int[] A = {34,34,130,99};
        System.out.println(solve(A));
    }
}