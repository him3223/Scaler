import java.util.*;

class Item3 {
    int value, weight;
    double ratio;
    Item3(int value, int weight) {
        this.value=value;
        this.weight=weight;
        this.ratio = (double)value/weight;
    }
}

public class Solution3 {

    public int solve(int[] A, int[] B, int C) {
        int len = A.length;
        Item3[] items = new Item3[len];
        for(int a=0; a<len; a++) items[a] = new Item3(A[a],B[a]);
        Arrays.sort(items,(x,y) -> Double.compare(y.ratio,x.ratio));
        double totalcost = 0.0;
        int capacity = C;
        for (Item3 it: items) {
            if (capacity==0) break;
            if (it.weight<=capacity) {
                totalcost+=it.value;
                capacity-=it.weight;
            }
            else {
                totalcost+=it.ratio*capacity;
                break;
            }
        }
        return (int) Math.round(totalcost);
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
