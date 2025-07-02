import java.util.HashMap;

public class HouseRobber {
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int robMemo(int[] nums) {
        return dp(nums, nums.length - 1);
    }

    private int dp(int[] nums, int i) {
        if (i < 0) return 0;
        if (memo.containsKey(i)) return memo.get(i);

        int result = Math.max(dp(nums, i - 2) + nums[i], dp(nums, i - 1));
        memo.put(i, result);
        return result;
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Max amount (Memoization): " + hr.robMemo(houses));  // Output: 12
    }
}
