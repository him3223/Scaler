import java.util.HashSet;
public class Solution {
    public static int lengthOfLongestSubstring(String A) {
    	int len = A.length();
    	int ans =0;
    	int s=0;
    	HashSet<String> hs = new HashSet<String>();
    	for (int a=0;a<len ;a++ ) {
    		if(hs.contains(""+A.charAt(a)))
    			hs.remove(s);
    		hs.add(""+A.charAt(a));
    		s++;
    		ans=Math.max(ans,hs.size());
    	}
    	return ans;
    }
	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}
}