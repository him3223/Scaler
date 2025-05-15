import java.util.*;
public class Solution4 {
    public static int lengthOfLongestSubstring(String A) {
        int len = A.length();
        HashSet<String> hs = new HashSet<String>();
        String ch;
        int s= 0;
        int ans = 0;
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
        String A = "AaaA";
        System.out.println(lengthOfLongestSubstring(A));
    }
}
