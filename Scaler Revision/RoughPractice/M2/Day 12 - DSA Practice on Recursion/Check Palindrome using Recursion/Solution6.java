public class Solution6 {
    public static int solve(String str) {
        if (ispal(str, 0, str.length()-1)) return 1;
        return 0; 
    }
    public static boolean ispal(String str, int s, int e){
        if (s>e) return true;
        if (str.charAt(s)!=str.charAt(e)) return false;
        return ispal(str,s+1,e-1);
    }
    public static void main(String[] args) {
        String str = "string";
        System.out.println(solve(str));
    }
}
