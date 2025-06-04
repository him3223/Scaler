import java.util.*;
public class Solution2 {
    public static int colorful(int A) {
        String str = ""+A;
        int len = str.length();
        int product = 0;
        HashSet<String> hs = new HashSet<String>();
        for (int a=0; a<len; a++) {
            product = 1;
            for (int b=a; b<len; b++) {
                product*=str.charAt(b)-'0';
                if (hs.contains(""+product)) {
                    return 0;
                }
                hs.add(""+product);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int A = 236;
        System.out.println(colorful(A));
    }
}
