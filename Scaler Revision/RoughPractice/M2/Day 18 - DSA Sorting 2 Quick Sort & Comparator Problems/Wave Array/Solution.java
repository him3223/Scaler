import java.util.Arrays;
public class Solution {
    public static int[] wave(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int temp = 0;
        for (int a=0; a<len-1; a+=2) {
            temp = A[a];
            A[a]=A[a+1];
            A[a+1]=temp;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {3, 6, 5, 10, 7, 20};
        System.out.println(Arrays.toString(wave(A)));
    }
}
