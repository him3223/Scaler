import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int longestConsecutive(final int[] A) {
        int ans =0;
        int cur =0;
        // int count =0;
        int len = A.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int a=0;a<len; a++)
            hs.add(A[a]);
        int size = hs.size();
        for (int a:hs) {
            cur=a;
            int count=1;
            if (!hs.contains(cur-1)) {
                while(hs.contains(cur+1)) {
                    count++;
                    cur++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(A));
    }
}
