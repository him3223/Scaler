import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null || A.size() == 0 || B <= 0) {
            return result;
        }
        
        int n = A.size();
        if (B > n) {
            // If B is greater than the array size, return max of the whole array
            int max = Integer.MIN_VALUE;
            for (int num : A) {
                max = Math.max(max, num);
            }
            result.add(max);
            return result;
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - B + 1) {
                deque.pollFirst();
            }

            // Remove indices whose values are less than the current element
            while (!deque.isEmpty() && A.get(deque.peekLast()) <= A.get(i)) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.addLast(i);

            // Add the maximum of the current window to the result
            if (i >= B - 1) {
                result.add(A.get(deque.peekFirst()));
            }
        }

        return result;
    }
}
