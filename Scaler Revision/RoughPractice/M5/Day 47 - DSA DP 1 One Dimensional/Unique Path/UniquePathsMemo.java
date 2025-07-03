import java.util.HashMap;

public class UniquePathsMemo {
    HashMap<String, Integer> memo = new HashMap<>();

    public int uniquePaths(int m, int n) {
        // Base case
        if (m == 1 || n == 1)
            return 1;

        String key = m + "," + n;
        System.out.println(key);
        if (memo.containsKey(key))
            return memo.get(key);

        int paths = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        memo.put(key, paths);
        return paths;
    }

    public static void main(String[] args) {
        UniquePathsMemo sol = new UniquePathsMemo();
        int m = 3, n = 3;
        System.out.println("Unique paths (Memoization): " + sol.uniquePaths(m, n));
    }
}
