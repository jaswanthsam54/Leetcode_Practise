class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0 ;
        int mid = 0;
        int high = nums.length - 1 ;
        while (mid <= high) {
            int ans = nums[mid] % 2;
            if (ans == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
        
    }
}