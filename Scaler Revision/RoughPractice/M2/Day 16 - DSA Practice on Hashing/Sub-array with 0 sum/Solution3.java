import java.util.*;
public class Solution3 {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
    public static int solve(int[] A) {
        int len = A.length;
        HashSet<Integer> prefixsumset = new HashSet<Integer>();
        int prefix = 0;
        int num = 0;
        for (int a=0; a<len; a++) {
            num = A[a];
            prefix+=num;
            if (prefix==0 || prefixsumset.contains(prefix)) return 1;
            prefixsumset.add(prefix);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {5,6,7,1,-7};
        System.out.println(solve(A));
    }
}
