public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        int l=0, r=len-1, mid =0, firstoccurrence=0;
        while (l<=r) {
            mid = (l+r)/2;
            if (((mid==0) || (A[mid]!=A[mid-1])) && ((mid==len-1) || (A[mid]!=A[mid+1])))
                return A[mid];
            firstoccurrence=mid;
            if (A[mid]==A[mid-1])
            firstoccurrence = mid-1;
            if (firstoccurrence%2==0)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
}
