public class Solution {
    public int paint(int A, int B, int[] C) {
        int max = 0;
        int sum = 0;
        int len = C.length;
        for (int a=0; a<len; a++) {
            max = Math.max(max, C[a]);
            sum += C[a];
        }
        
        int l = max;
        int r = sum;
        int ansTime = 0;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossibleToPaintBoard(C, mid, A, len)) {
                ansTime = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return (int)((long)ansTime * B % 10000003);
    }
    
    private boolean isPossibleToPaintBoard(int[] boards, int maxTime, int painters, int len) {
        int painterCount = 1;
        int currentTime = 0;
        
        for (int a=0; a<len; a++) {
            if (currentTime + boards[a] > maxTime) {
                painterCount++;
                currentTime = boards[a];
                if (painterCount > painters) {
                    return false;
                }
            } else {
                currentTime += boards[a];
            }
        }
        return true;
    }
}
