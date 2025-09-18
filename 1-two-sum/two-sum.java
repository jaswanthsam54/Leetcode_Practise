import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number to the map
            map.put(nums[i], i);
        }
        
        // Problem guarantees one solution, so this line won't be reached
        throw new IllegalArgumentException("No two sum solution");
    }
}
