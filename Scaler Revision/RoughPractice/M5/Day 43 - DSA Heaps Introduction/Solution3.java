import java.util.PriorityQueue;

public class Solution3 {
    public int solve(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int totCost = 0;
        int cost = 0;
        for (int a: A) {
            minHeap.add(a);
        }
        while (minHeap.size()>1) {
            cost = minHeap.poll()+minHeap.poll();
            totCost+=cost;
            minHeap.add(totCost);
        }
        return totCost;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ropes = {4, 3, 2, 6};
        int result = solution.solve(ropes);
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}
