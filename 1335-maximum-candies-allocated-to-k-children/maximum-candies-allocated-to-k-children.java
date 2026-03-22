class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;

        for (int c : candies) {
            total += c;
        }

        long lo = 1;
        long hi = total / k; 

        long result = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (canDistribute(candies, k, mid)) {
                result = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return (int)result;
    }

    private boolean canDistribute(int[] candies, long k, long x) {
        long count = 0;

        for (int c : candies) {
            count += c / x;
        }

        return count >= k;
    }
}