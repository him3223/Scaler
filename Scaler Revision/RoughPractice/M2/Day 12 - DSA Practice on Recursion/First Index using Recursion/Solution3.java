public class Solution3 {
    public static int FirstIndex(int[] A, int B) {
        return findex(A,B,0);
    }
    public static int findex(int[] A, int B, int index) {
        if (index == A.length) return -1;
        if (A[index]==B) return index;
        return findex(A,B,index+1);
    }
    public static void main(String[] args) {
        int[] A = {6,-3, 5, 6, 2};
        int B = 6;
        System.out.println(FirstIndex(A,B));
    }
}
