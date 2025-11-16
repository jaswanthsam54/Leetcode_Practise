class Solution {
    public boolean check(int[] nums) {
        return helper(nums, 0, 0);
    }

    private boolean helper(int[] nums, int i, int breaks) {
        int n = nums.length;

        if (breaks > 1) return false;
        if (i == n - 1) { 
            // compare last with first for circular
            if (nums[i] > nums[0]) breaks++;
            return breaks <= 1;
        }

        if (nums[i] > nums[i+1]) breaks++;

        return helper(nums, i+1, breaks);
    }
}
