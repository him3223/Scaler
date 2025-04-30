public class Solution {
    public static int getMax(int[] A) {
        int len = A.length;
        return findmax(A,len);
    }
    public static int findmax(int[] A, int len) {
        if (len==1) return A[0];
        int max = findmax(A,len-1);
        return Math.max(max,A[len-1]);
    }
    public static void main(String[] args) {
        int[] A = {12, 10, 3, 4, 5};
        System.out.println(getMax(A));
    }
}
