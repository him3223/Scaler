import java.util.*;
public class Solution3 {
    public static int lengthOfLongestSubstring(String A) {
        int len = A.length();
        HashSet<String> hs = new HashSet<String>();
        String ch;
        int ans=0;
        int s = 0;
        for (int a=0; a<len; a++) {
            ch=""+A.charAt(a);
            while (hs.contains(ch)) {
                hs.remove(""+A.charAt(s));
                s++;
            }
            hs.add(ch);
            ans=Math.max(ans,hs.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        String A = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(A));
    }
}
