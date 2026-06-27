class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> freq = new HashMap<>();
        long windowSum = 0;
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];
            if (i >= k) {
                int outgoing = nums[i - k];
                windowSum -= outgoing;
                freq.put(outgoing, freq.get(outgoing) - 1);
                if (freq.get(outgoing) == 0) {
                    freq.remove(outgoing);
                }
            }
            if (i >= k - 1 && freq.size() == k) {
                result = Math.max(result, windowSum);
            }
        }
        return result;
    }
}