import java.util.HashMap;

public class HouseRobber {
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int robMemo(int[] nums) {
        return dp(nums, nums.length - 1);
    }
    public int dp (int[]nums int a) {
        if (a<0) return 0;
        if (memo.containsKey(a)) return memo.get(a);
    }
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Max amount (Memoization): " + hr.robMemo(houses));  // Output: 12
    }
}
