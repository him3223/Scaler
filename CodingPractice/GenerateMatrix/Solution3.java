import java.util.Arrays;
public class Solution3 {
    public static int[][] generateMatrix(int len) {
        int[][] result = new int[len][len];
        int top = 0, left = 0, right = len-1, down=len-1, num=1;
        while (top<=down && left <= right) {
            for (int a=left;a<=right;a++ ) {
                result[top][a]=num++;
            }
            top++;
            for (int a=top;a<=down ;a++ ) {
                result[a][right]=num++;
            }
            right--;
            if (top<=down) {
                for (int a=right; a>=left;a-- ) {
                    result[down][a]=num++;
                }
                down--;
            }
            if (left<=right) {
                for (int a=down; a>=top; a--) {
                    result[a][left]=num++;
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int len = 4;
        System.out.println(Arrays.deepToString(generateMatrix(len)));
    }
}
