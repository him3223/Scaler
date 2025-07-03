import java.util.HashMap;

public class UniquePathsMemo2 {
    HashMap<String, Integer> memo = new HashMap<>();

    public int uniquePaths(int m, int n) {
        if (m==1 || n==1) return 1;
        String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        int path = uniquePaths(m, (n-1)) + uniquePaths(n,(m-1));
        memo.put(key,path);
        return path;
    }

    public static void main(String[] args) {
        UniquePathsMemo2 sol = new UniquePathsMemo2();
        int m = 3, n = 3;
        System.out.println("Unique paths (Memoization): " + sol.uniquePaths(m, n));
    }
}
