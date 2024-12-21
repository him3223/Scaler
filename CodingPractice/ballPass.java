public class Solution {
    public int solve(int A, int B, int[] C) {
        // Start with the player B having the ball
        int currentPlayer = B;
        int previousPlayer = -1; // There's no previous player at the start
        
        // Process each pass
        for (int i = 0; i < A; i++) {
            if (C[i] != 0) {
                // Forward pass: update previous and current player
                previousPlayer = currentPlayer;
                currentPlayer = C[i];
            } else {
                // Back pass: return the ball to the previous player
                currentPlayer = previousPlayer;
                // Update previous player to the one who had the ball before the current one
                previousPlayer = -1;  // After a back pass, no one is the previous player
            }
        }
        
        // Return the ID of the player who has the ball after A passes
        return currentPlayer;
    }
}
