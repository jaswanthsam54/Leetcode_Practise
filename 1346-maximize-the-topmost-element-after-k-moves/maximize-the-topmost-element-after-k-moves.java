class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            if (k % 2 == 1) return -1;
            else return nums[0];
        }
        if (k == 0) return nums[0];
        if (k == 1) return nums[1];
        int maxVal = -1;
        for (int i = 0; i < Math.min(n, k - 1); i++) {
            maxVal = Math.max(maxVal, nums[i]);
        }
        if (k < n) {
            maxVal = Math.max(maxVal, nums[k]);
        }
        return maxVal;
    }
}