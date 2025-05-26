public class Solution2 {
    public static String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while (A>0) {
            A/=26;
        }
    }
    public static void main(String[] args) {
        int A = 108;
        System.out.println(convertToTitle(A));
    }
}
