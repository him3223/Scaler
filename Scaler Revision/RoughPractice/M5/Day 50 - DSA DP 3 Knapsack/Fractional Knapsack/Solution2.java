import java.util.*;

class Item2 {
    int value, weight;
    double ratio;
    Item2(int value, int weight) {
        this.value=value;
        this.weight=weight;
        this.ratio = (double)value/weight;
    }
}

public class Solution2 {

    public int solve(int[] A, int[] B, int C) {
        int len = A.length;
        Item2[] items = new Item2[len];
        for (int a=0; a<len; a++) items[a] = new Item2(A[a],B[a]);
        Arrays.sort(items,(x,y) -> Double.compare(y.ratio,x.ratio));
        double totalValue = 0.0;
        int capacity = C;
        for (Item2 it: items) {
            if (capacity==0) break;
            if (it.weight<=capacity) {
                totalValue+=it.value;
                capacity-=it.weight;
            }
            else {
                totalValue+=it.ratio*capacity;
                break;
            }
        }
        return (int) Math.round(totalValue);
    }


    public static void main(String[] args) {
        int[] A = {60, 100, 120}; // values
        int[] B = {10, 20, 30};   // weights
        int C = 50;               // knapsack capacity

        Solution2 sol = new Solution2();
        int ans = sol.solve(A, B, C);
        System.out.println("Maximum value in knapsack: " + ans);
    }
}
