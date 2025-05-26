public class Solution2 {
    public static int titleToNumber(String A) {
        int len = A.length();
        char ch;
        int result = 0;
        int value = 0;
        for (int a=0; a<len; a++) {
            ch=A.charAt(a);
            value = ch-'A'+1;
            result = result*26+value;
        }
        return result;
    }
    public static void main(String[] args) {
        String A = "ZZ";
        System.out.println(titleToNumber(A));
    }
}
