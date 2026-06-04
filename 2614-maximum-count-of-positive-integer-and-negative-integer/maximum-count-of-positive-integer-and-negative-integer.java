class Solution {
    public int maximumCount(int[] nums) {
        int lo = 0;
        int hi = nums.length ;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= 0 ) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        int neg = lo;
        lo = 0 ;
        hi = nums.length;
        while (lo < hi){
            int mid = lo + (hi - lo)/2;
            if (nums[mid] > 0) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        int pos = nums.length - lo;
        return Math.max(neg,pos);
    }
}