import java.util.*;
public class Solution2 {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
    public static int solve(int[] A) {
        int len = A.length;
        int prefix = 0;
        int num =0;
        HashSet<Integer> prefixset = new HashSet<Integer>();
        for (int a=0; a<len; a++) {
            num=A[a];
            prefix+=num;
            if (prefix==0|| prefixset.contains(prefix)) return 1;
            prefixset.add(prefix);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {5,6,7,-7};
        System.out.println(solve(A));
    }
}
