import java.util.Arrays;
public class Solution {
    public static int[] plusOne(int[] A) {
        int n = A.length;
        
        // Step 1: Find the index of the first non-zero digit
        int start = 0;
        while (start < n && A[start] == 0) {
            start++;
        }

        // Handle case where all digits are zero
        if (start == n) return new int[]{1};

        // Step 2: Work with a trimmed array (no leading zeros)
        int[] trimmed = new int[n - start];
        System.arraycopy(A, start, trimmed, 0, n - start);

        // Step 3: Add one starting from the end
        int carry = 1;
        for (int i = trimmed.length - 1; i >= 0; i--) {
            if (carry==0) break;
            int sum = trimmed[i] + carry;
            trimmed[i] = sum % 10;
            carry = sum / 10;
        }

        // Step 4: If there's still a carry, create a new array
        if (carry > 0) {
            int[] result = new int[trimmed.length + 1];
            result[0] = carry;
            System.arraycopy(trimmed, 0, result, 1, trimmed.length);
            return result;
        }

        return trimmed;
    }
    public static void main(String[] args) {
        int[] A = {0, 0, 1, 2, 3};
        System.out.println(Arrays.toString(plusOne(A)));
    }
}