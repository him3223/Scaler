public class Solution {
    public int sqrt(int A) {
        if (A==0 || A==1)
        return A;
        int l=1, r= A/2, mid=0, ans = 0;
        while (l<=r) {
            mid = l+(r-l)/2;
            if (mid*mid==A) 
                return mid;
            else if (mid>A/mid)
                r=mid-1;
            else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}
