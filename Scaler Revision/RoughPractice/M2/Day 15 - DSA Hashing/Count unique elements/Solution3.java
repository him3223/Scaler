import java.util.*;
public class Solution3 {
    public static int solve(ArrayList<Integer> A) {
        int len = A.size();
        int num = 0;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int a=0; a<len; a++) {
            num = A.get(a);
            if (hm.containsKey(num)) hm.put(num,hm.get(num)+1);
            else hm.put(num,1);
        }
        for (int freq:hm.values()) {
            if (freq==1) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(12,12,13,13,15));
        System.out.println(solve(A));
    }
}