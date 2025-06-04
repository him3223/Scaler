import java.util.*;

public class Solution {
    public static int colorful(int A) {
        String numstr = ""+A;
        int product = 1;
        int len = numstr.length();
        HashSet<String> hs = new HashSet<String>();
        for (int a=0; a<len; a++) {
            product = 1;
            for (int b=a; b<len; b++) {
                product*=numstr.charAt(b)-'0';
                if (hs.contains(""+product)) {
                    return 0;
                }
                hs.add(""+product);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int A = 23;
        System.out.println(colorful(A));
    }
}
