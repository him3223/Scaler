import java.util.PriorityQueue;

public class Solution {
    public int solve(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert all rope lengths into the min-heap
        for (int rope : A) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // Process while more than one rope remains
        while (minHeap.size() > 1) {
            int first = minHeap.poll();  // Smallest rope
            int second = minHeap.poll(); // Second smallest rope
            int cost = first + second;   // Cost of joining them
            totalCost += cost;           // Add to total cost
            minHeap.add(cost);           // Add the new rope back to heap
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ropes = {4, 3, 2, 6};
        int result = solution.solve(ropes);
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}
