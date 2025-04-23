public class Solution {
    public int solve(String A) {
        if (isPal(A,0,A.length()-1))
            return 1;
        return 0;
    }
    public boolean isPal(String str, int s, int e) {
        if (s>e)
            return true;
        if(str.charAt(s)!=str.charAt(e))
            return false;
        return isPal(str,s+1,e-1);
    }
}
