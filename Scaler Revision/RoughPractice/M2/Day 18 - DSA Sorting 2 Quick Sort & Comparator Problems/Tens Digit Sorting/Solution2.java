import java.util.*;
public class Solution2 {
    public static int[] solve(int[] A) {
        int len = A.length;
        Integer[] boxes = new Integer[len];
        int result[] = new int[len];
        for (int a=0; a<len; a++) {
            boxes[a]=A[a];
        }
        Arrays.sort(boxes,new Tensort());
        for (int a=0; a<len; a++) {
            result[a]=boxes[a];
        }
        return result;
    }
    static class Tensort implements Comparator<Integer> {
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
