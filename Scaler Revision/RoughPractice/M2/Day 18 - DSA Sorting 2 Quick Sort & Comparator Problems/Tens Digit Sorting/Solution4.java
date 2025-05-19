import java.util.*;
public class Solution4 {
    public static int[] solve(int[] A) {
        int lem = A.length;
        Integer[] boxes = new Integer[lem];
        int[] result = new int[lem];
        for (int a=0; a<lem; a++) {
            boxes[a]=A[a];
        }
        Arrays.sort(boxes,new tenssort());
        for (int a=0; a<lem; a++) {
            result[a]=boxes[a];
        }
        return result;
    }
    static class tenssort implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            int tenA = (Math.abs(a)/10)%10;
            int tenB = (Math.abs(b)/10)%10;
            if (tenA!=tenB) return Integer.compare(tenA,tenB);
            return Integer.compare(b,a);
        }
    }
    public static void main(String[] args) {
        int[] A = {2, 24, 22, 19};
        System.out.println(Arrays.toString(solve(A)));
    }
}
