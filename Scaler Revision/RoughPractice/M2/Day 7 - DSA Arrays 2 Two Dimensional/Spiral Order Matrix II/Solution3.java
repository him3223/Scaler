import java.util.Arrays;
public class Solution3 {
    public static int[][] generateMatrix(int A) {
        int[][] result = new int[A][A];
        int top = 0, down = A-1, left = 0, right = A-1, num = 0;
        while (top<=down && left <=right) {
            for (int a=left; a<=right; a++) {
                result[top][a] = num++;
            }
            top++;
            for (int a=top; a<=down; a++) {
                result[a][right] = num++;
            }
            right--;
            if (top<=down) {
                for(int a=right; a>=left; a--) {
                    result[down][a] = num++;
                }
                down--;
            }
            if (left<=right) {
                for(int a=down; a>=top; a--) {
                    result[a][left] = num++;
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int A = 5;
        System.out.println(Arrays.deepToString(generateMatrix(A)));
    }
}