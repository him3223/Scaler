import java.util.*;
public class Solution {
    public static int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = B.size();
        int num=0;
        for (int a=0; a<len; a++) {
            num=B.get(a);
            int part = A-num;
            if (hs.contains(part))
            return 1;
            hs.add(num);
        }
        return 0;
    }
    public static void main(String[] args) {
        int A = 8;
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 1, 2));
        System.out.println(solve(A,B));
    }
}
