public class Solution {
    public static String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while(A>0) {
            A--;
            sb.insert(0,(char)('A'+(A%26)));
            A/=26;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int A = 108;
        System.out.println(convertToTitle(A));
    }
}
