public class Solution3 {
    public static int titleToNumber(String A) {
        int len = A.length();
        char ch;
        int value = 0;
        int result = 0;
        for (int a=0; a<len; a++) {
            ch=A.charAt(a);
            value = ch-'A'+1;
            result = result*26+value;
        }
        return result;
    }
    public static void main(String[] args) {
        String A = "AB"; // 28
        System.out.println(titleToNumber(A));
    }
}
