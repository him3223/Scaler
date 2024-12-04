public class Solution {
    public int solve(int A) {
        int sqrt = (int)Math.sqrt(A);
        int count =0;
        for (int a=1; a<=sqrt; a++) {
            if (A%a==0) {
                if (a==A/a) {
                    count++;
                }
                else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
