public class SubarrayWGSum {

    public static boolean hasSubarraySum(int[] arr, int target) {
        int a = 0, b = 0, sum = 0;

        while (b < arr.length) {
            sum += arr[b];

            while (sum > target && a <= b) {
                sum -= arr[a++];
            }

            if (sum == target) return true;
            b++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println("Subarray with sum " + sum + " exists: " + hasSubarraySum(arr, sum));
    }
}
