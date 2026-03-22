class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0 ;
        int hi = 0;
        for (int n : nums) {
            lo = Math.max(lo,n);
            hi += n;
        }
        int result = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (cansplit(nums,k,mid)){
                result = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return result;
    }
        private boolean cansplit(int[] nums , int k , int max) {
            int kmax = 1;
            int currentsum = 0;
            for (int n : nums) {
                if (currentsum + n > max) {
                    kmax++;
                    currentsum = n;
                }
                else {
                    currentsum += n;
                }
            }
            return kmax <= k;
        }
}