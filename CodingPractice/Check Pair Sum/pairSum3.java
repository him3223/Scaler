import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class pairSum3 {
    public static int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = B.size();
        int num = 0;
        int part = 0;
        for (int a=0; a<len; a++) {
            num = B.get(a);
            part = A - num;
            if (hs.contains(part))
                return 1;
            hs.add(num);
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 1, 2));
        int A =8;
        System.out.println(solve(A,B));
    }
}