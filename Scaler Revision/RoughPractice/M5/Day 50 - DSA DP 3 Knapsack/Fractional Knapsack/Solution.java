import java.util.*;

class Item {
    int value, weight;
    double ratio;

    Item(int value, int weight) {
        this.value  = value;
        this.weight = weight;
        this.ratio  = (double) value / weight;
    }
}

public class Solution {

    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
        Item[] items = new Item[n];

        // Build items and sort by decreasing value-to-weight ratio
        for (int i = 0; i < n; i++) items[i] = new Item(A[i], B[i]);
        Arrays.sort(items, (x, y) -> Double.compare(y.ratio, x.ratio));

        double totalValue = 0.0;
        int capacity      = C;

        for (Item it : items) {
            if (capacity == 0) break;          // knapsack full
            if (it.weight <= capacity) {       // take whole item
                totalValue += it.value;
                capacity   -= it.weight;
            } else {                           // take fractional part
                totalValue += it.ratio * capacity;
                break;
            }
        }
        return (int) Math.round(totalValue);   // convert double → int
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();  // values
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();  // weights

        int C = sc.nextInt();                             // capacity

        int ans = new Solution().solve(A, B, C);
        System.out.println(ans);

        sc.close();
    }
}
