class Solution {
    public int[] runningSum(int[] nums) {
        int prev=nums[0];
        int curr=0;
        for(int i=1;i<nums.length;i++){
            curr=nums[i];
            nums[i]=prev+curr;
            prev=nums[i];
        }
        return nums;
    }
}