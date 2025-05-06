// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
import java.util.*;
public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int alen = A.size();
        int blen = B.size();
        int anum = 0;
        int bnum = 0;
        for (int a=0; a<alen; a++) {
            anum = A.get(a);
            if (hm.containsKey(anum)) hm.put(anum,hm.get(anum)+1);
            else hm.put(anum,1);
        }
        for (int b=0; b<blen; b++) {
            bnum = B.get(b);
            if (hm.containsKey(bnum) && hm.get(bnum) >0) {
                result.add(bnum);
                hm.put(bnum,hm.get(bnum)-1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 4, 10));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10));
        System.out.println(solve(A,B));
    }
}
