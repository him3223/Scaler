public class Solution4 {
    public static int getMax(int[] A) {
        int len = A.length;
        return findmax(A,len);
    }
    public static int findmax(int[] A, int len){
        if (len==1) return A[0];
        int max = findmax(A,len-1);
        return Math.max(max,A[len-1]);
    }
    public static void main(String[] args) {
        int[] A = {1, -5, 80, -40};
        System.out.println(getMax(A));
    }
}
