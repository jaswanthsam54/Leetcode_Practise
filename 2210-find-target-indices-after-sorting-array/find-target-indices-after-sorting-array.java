import java.util.*;

class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        List<Integer> result = new ArrayList<>();

        if (first == -1) return result;

        for (int i = first; i <= last; i++) {
            result.add(i);
        }

        return result;
    }

    private int firstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private int lastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}