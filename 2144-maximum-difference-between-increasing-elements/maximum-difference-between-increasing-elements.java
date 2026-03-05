class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int m2 = -1;
        for (int i = 1 ; i < n ; i++){
            if (min < nums[i]){
                int m1 = nums[i] - min;
                 m2 = Math.max(m2,m1);
            }
            else {
                min = nums[i];
            }
        }
        return m2;
    }
}