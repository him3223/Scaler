public class Solution {
    public static void PrintArray(int[] A) {
        int len = A.length;
        pri(A,0,len);
        System.out.println();
    }
    public static void pri(int[] A, int c, int len){
        if (c==len) {
            return;
        }
        System.out.print(A[c]+" ");
        pri(A,c+1,len);
    }
    public static void main(String[] args) {
        int[] A = {4,6,8,3,2};
        PrintArray(A);
    }
}
