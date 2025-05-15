import java.util.*;
public class Solution5 {
    public static int lengthOfLongestSubstring(String A) {
        int len = A.length();
        HashSet<String> hs = new HashSet<String>();
        int ans = 0;
        int s =0;
        String ch;
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
        String A = "ttbbcbabrbbtt";
        System.out.println(lengthOfLongestSubstring(A));
    }
}
