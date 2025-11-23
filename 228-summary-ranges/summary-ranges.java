import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        int n = nums.length;
        if (n == 0) return result;

        int start = nums[0], prev = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == prev + 1) {
                // Continue the range
                prev = nums[i];
            } else {
                // Close current range
                if (start == prev) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + prev);
                }
                // Start new range
                start = prev = nums[i];
            }
        }

        // Add the final range
        if (start == prev) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + prev);
        }

        return result;
    }
}
