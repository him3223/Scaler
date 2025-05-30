public class Solution5 {
    public static int firstMissingPositive(int[] A) {
        int len = A.length;
        boolean[] check = new boolean[len];
        for (int a=0; a<len; a++) {
            if (A[a]>0 && A[a]<=len) {
                check[A[a]]=true;
            }
        }
        for (int a=0; a<len; a++) {
            if (!check[a]) return a+1;
        }
        return len+1;
    }
    public static void main(String[] args) {
        int[] A = {-8,-7,-6};
        System.out.println(firstMissingPositive(A));
    }
}
