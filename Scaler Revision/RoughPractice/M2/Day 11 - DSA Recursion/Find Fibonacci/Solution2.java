public class Solution2 {
    public static int findAthFibonacci(int A) {
        if (A<2) return A;
        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
    public static void main(String[] args) {
        int A = 9;
        System.out.println(findAthFibonacci(A));
    }
}
