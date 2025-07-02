import java.util.Arrays;

public class MaxHappiness2 {
    static int[][] dp;

    public static int maxHappiness(int[] cost, int[] happiness, int n, int budget) {
        if (n==0 || budget==0) return 0;
        if (dp[n][budget] != -1) return dp[n][budget];
        if (cost[n-1]>budget) dp[n][budget] = maxHappiness(cost, happiness, n-1, budget);
        else {
            int include = happiness[n-1]+ maxHappiness(cost,happiness, n-1, budget-cost[n-1]);
            int exlude = maxHappiness(cost,happiness,n-1,budget);
            dp[n][budget] = Math.max(include,exlude);
        }
        return dp[n][budget];
    }

    public static void main(String[] args) {
        int[] cost = {3, 2, 4};
        int[] happiness = {4, 3, 5};
        int budget = 6;
        int n = cost.length;

        dp = new int[n + 1][budget + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println("Max Happiness (DP): " + maxHappiness(cost, happiness, n, budget));
    }
}
