import java.util.PriorityQueue;

public class Solution2 {
    public int solve(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int totCost = 0;
        int firstrope = 0;
        int secondrope = 0;
        for (int a: A) {
            minHeap.add(a);
        }
        while (minHeap.size()>1) {
            firstrope = minHeap.poll();
            secondrope = minHeap.poll();
            totCost += (firstrope+secondrope);
            minHeap.add(firstrope+secondrope);
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
