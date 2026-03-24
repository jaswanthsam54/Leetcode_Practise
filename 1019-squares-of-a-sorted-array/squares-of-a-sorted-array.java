class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1 ;
        int k = nums.length - 1 ;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                int square = nums[right] * nums[right];
                arr[k] = square;
                right--;
            }
            else {
                int square = nums[left] * nums[left];
                arr[k] = square;
                left++;
            }
            k--;
        }
        return arr;
    }
}