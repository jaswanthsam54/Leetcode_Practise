class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0 ){
            return 0;
        }
        if (nums.length == 1 && nums[0] == k){
            return 1;
        }
        int cs = 0;
        int count = 0;
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        // prefix array 
        for (int i = 1 ; i < pre.length ; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        // maximum subarray 
        for (int i = 0 ; i < nums.length ; i++){
            int st = i;
            for (int j = i ; j < pre.length ; j++){
                int end = j;
               if ( st == 0){
                cs = pre[end];
               }
               else {
                cs = pre[end] - pre[st - 1];
               }
               if (cs == k) {
                count = count + 1;
               }
            }
        }
        return count;
    }
}