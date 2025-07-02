public class SubarrayWGSum3 {

    public static boolean hasSubarraySum(int[] arr, int target) {
        int a = 0;
        int b = 0;
        int sum = 0;
        int len = arr.length;
        while (b<len) {
            if (sum==target) return true;
            sum+=arr[b];
            while (sum> target && a<=b) {
                sum -= arr[a++];
            }
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
