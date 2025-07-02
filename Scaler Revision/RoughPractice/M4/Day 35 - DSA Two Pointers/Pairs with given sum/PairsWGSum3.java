public class PairsWGSum3 {

    public static boolean hasPairWithSum(int[] arr, int sum) {
        int len = arr.length;
        int a=0;
        int b=len-1;
        int currSum = 0;
        while (a<b) {
            currSum = arr[a]+arr[b];
            if (currSum==sum) return true;
            else if (currSum<sum) a++;
            else b--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8};
        int sum = 10;
        System.out.println("Pair with sum " + sum + " exists: " + hasPairWithSum(arr, sum));
    }
}
