class Solution {
    public double new21Game(int n, int k, int maxPts) {
        // Corner cases:
        // 1. If k == 0, Alice starts with 0 and stops immediately. 0 <= n is always true.
        // 2. If the maximum possible score (k - 1 + maxPts) is <= n, she will always finish with <= n points.
        if (k == 0 || k - 1 + maxPts <= n) {
            return 1.0;
        }

        // dp[i] will store the probability of getting exactly i points
        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double windowSum = 1.0;
        double totalProbability = 0.0;

        for (int i = 1; i <= n; i++) {
            // The probability of reaching i is the average of the valid previous states in our window
            dp[i] = windowSum / maxPts;

            // If we are still in the zone where Alice can draw cards (< k),
            // this new state can contribute to future states.
            if (i < k) {
                windowSum += dp[i];
            } else {
                // If we reached or exceeded k, Alice stops.
                // We start accumulating our final answer if it's within n.
                totalProbability += dp[i];
            }

            // Slide the window forward: remove the state that falls out of maxPts range
            if (i - maxPts >= 0) {
                // Only subtract if that state was originally added to the window (i.e., its index < k)
                if (i - maxPts < k) {
                    windowSum -= dp[i - maxPts];
                }
            }
        }

        return totalProbability;
    }
}