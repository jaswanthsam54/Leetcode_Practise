class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // The range for our binary search
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canFinish(piles, h, mid)) {
                result = mid; // This speed works, but can we go slower?
                right = mid - 1;
            } else {
                left = mid + 1; // Too slow, need to increase speed
            }
        }
        
        return result;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long totalHours = 0; // Use long to prevent overflow
        for (int pile : piles) {
            // Equivalent to Math.ceil(pile / speed)
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= h;
    }
}