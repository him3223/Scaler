public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count frequency of elements in array A
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through array B and collect common elements
        for (int num : B) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 4, 10));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10));
        System.out.println(solve(A,B));
    }
}
