import java.util.*;
public class Solution2 {
    public static int lengthOfLongestSubstring(String A) {
        int ans = 0;
        int len = A.length();
        int s = 0;
        HashSet<String> hs = new HashSet<String>();
        for (int a=0; a<len; a++) {
            while (hs.contains(""+A.charAt(a))) {
                hs.remove(""+A.charAt(s));
                s++;
            }
            hs.add(""+A.charAt(a));
            ans=Math.max(ans,hs.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        String A = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(A));
    }
}
