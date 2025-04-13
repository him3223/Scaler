public class Solution2 {
    public static int solve(int[] A, int B) {
        int len = A.length;
        int sum = 0;
        int minsum = 0;
        int minindex = 0;
        for (int a=0;a<B ;a++ ) {
            sum+=A[a];
        }
        minsum = sum;
        for (int a=B;a<len ;a++ ) {
            sum+=A[a]-A[a-B];
            if (sum<minsum) {
                minsum = sum;
                minindex = a-B+1;
                
            }
        }
        return minindex;
    }
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
