import java.util.*;

class Item4 {
    int value;
    int weight;
    double ratio;
    Item4 (int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double)value/ratio;
    }
}

public class Solution4 {

    public int solve(int[] A, int[] B, int C) {
        int len = A.length;
        Item4[] items = new Item4[len];
        for (int a=0; a<len; a++) {
            items[a]= new Item4(A[a],B[a]);
        }
        Arrays.sort(items,(x,y) -> Double.compare(y.ratio, x.ratio));
        double totalcost=0.0;
        int capacity = C;
        for (Item4 it: items) {
            if (it.weight<=capacity) {
                totalcost+=it.value;
                capacity-=it.weight;
            }
            else {
                totalcost+=it.value*capacity;
                break;
            }
        }
        return (int)Math.round(totalcost);
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
