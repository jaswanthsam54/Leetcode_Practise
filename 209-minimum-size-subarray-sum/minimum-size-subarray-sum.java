class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0;
        int sum = 0;
        int miniuncle = Integer.MAX_VALUE;
        for (int fast = 0 ; fast < nums.length ; fast++) {
            sum += nums[fast];
            while (sum >= target) {
                miniuncle = Math.min(miniuncle , fast - slow + 1);
                sum -= nums[slow];
                slow++;
            }
        }
        return miniuncle == Integer.MAX_VALUE ? 0 : miniuncle ;
    }
}