class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
            int min = nums[0];
        for (int i = 0 ; i < nums.length ; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        while ( max > 0 && min > 0) {
            if (max > min) {
                max = max % min;
            }
            else {
                min = min % max;
            }
        }
        if (max == 0) {
            return min;
        }
        else {
            return max ;
        }
     }
 }
