public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        int len = A.length;
        if (A[0]>B || A[len-1]<B)
        return new int[] {-1,-1};
        return new int [] {leftmost(A,B,len),rightmost(A,B,len)};
    }
    public int leftmost(int[] A, int B, int len) {
        int l=0, r=len-1, ans = -1, mid =0;
        while(l<=r){
            mid = (l+r)/2;
            if (A[mid]==B){
                ans=mid;
                r=mid-1;
            }
            else if (A[mid]<B)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }
    public int rightmost(int[] A, int B, int len) {
        int l=0, r=len-1, ans = -1, mid =0;
        while(l<=r){
            mid = (l+r)/2;
            if (A[mid]==B){
                ans=mid;
                l=mid+1;
            }
            else if (A[mid]<B)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }
}
