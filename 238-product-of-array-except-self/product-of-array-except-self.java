class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] output = new int[n];

        // Suffix
        output[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            output[i] = output[i + 1] * nums[i + 1];
        }

        // Prefix
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            output[i] = output[i] * prefix;
            prefix = prefix * nums[i];
        }

        return output;
    }
}