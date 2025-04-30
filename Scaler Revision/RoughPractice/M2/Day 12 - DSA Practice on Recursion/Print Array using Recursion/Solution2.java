public class Solution2 {
    public static void PrintArray(int[] A) {
        int len = A.length;
        pri(A,len-1);
    }
    public static void pri(int[] A, int len) {
        if (len==0) return;
        pri(A,len-1);
        System.out.println(A[len]);
    }
    public static void main(String[] args) {
        int[] A = {4,6,8,3,2};
        PrintArray(A);
    }
}
