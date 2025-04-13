public class Solution {
    public static int solve(int[][] A) {
        int len = A.length;
        int tot = 0;
        int tl= 0;
        int br =0;
        for (int a=0; a<len; a++) {
            for (int b=0; b<len; b++) {
                tl = (a+1)*(b+1);   // top-left choices
                br = (len-a)*(len-b);   // bottom-right choices
                tot+=(tl*br*A[a][b]);    // contribution of A[a][b]
            }
        }
        return tot;
    }
    public static void main(String[] args) {
        // 40
        int[][] A = {{1,2},{3,4}};
        System.out.println(solve(A));
    }
}
