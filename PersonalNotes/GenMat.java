public class GenMat {
    public int[][] generateMatrix(int A) {
       int[][] result = new int[A][A];
        int top = 0, bottom = A - 1, left = 0, right = A - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++;
            }
        }
        
        return result;
    }
}
