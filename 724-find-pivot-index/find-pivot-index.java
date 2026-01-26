class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for (int i = 1 ; i < n ; i++){
            pre[i] = nums[i] + pre[i-1];
        }
        for(int i = 0 ; i < n ; i++){
            int l;
            int r;
            if (i == 0){
                l = 0;
            }
            else {
                l = pre[i-1];
            }
            r = pre[n - 1] - pre[i];
            if (l == r){
                return i;
            } 
        }
        return -1;
    }
}