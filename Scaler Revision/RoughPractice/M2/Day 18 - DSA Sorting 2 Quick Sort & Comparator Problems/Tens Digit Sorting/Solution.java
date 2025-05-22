import java.util.*;
public class Solution {
    public static int[] solve(int[] A) {
        int len = A.length;
        Integer[] num = new Integer[len];
        int[] result = new int[len];
        for (int a=0;a<len;a++) {
            num[a]=A[a];
        }
        Arrays.sort(num,new tendig());
        for (int a=0; a<len; a++) {
            result[a]=boxes[a];
        }
        return result;
    }
    static class tendig implements Comparator<Integer>{
        public int compare(Integer a, Integer b) {
            int tensA = (Math.abs(a)/10)%10;
            int tensB = (Math.abs(b)/10)%10;
            if (tensA!=tensB) return Integer.compare(tensA,tensB);
            return Integer.compare (b,a);
        }
    }
    public static void main(String[] args) {
        int[] A = {2, 24, 22, 19};
        System.out.println(Arrays.toString(solve(A)));
    }
}
