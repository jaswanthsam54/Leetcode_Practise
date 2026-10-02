import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        findSubsets(nums, new ArrayList<>(), 0);

        return result;
    }

    void findSubsets(int[] nums, List<Integer> current, int idx) {

        // Base Case
        if (idx == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // PICK
        current.add(nums[idx]);
        findSubsets(nums, current, idx + 1);

        // BACKTRACK
        current.remove(current.size() - 1);

        // SKIP DUPLICATES
        idx++;

        while (idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }

        // NOT PICK
        findSubsets(nums, current, idx);
    }
}