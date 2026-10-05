import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> combin = new ArrayList<>();
        getAllCombinations(candidates, 0, target, ans, combin);
        return new ArrayList<>(ans);
    }

    private void getAllCombinations(
            int[] arr, int idx, int tar,
            Set<List<Integer>> ans, List<Integer> combin) {
        if (idx == arr.length || tar < 0) {
            return;
        }
        if (tar == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }
        combin.add(arr[idx]);
        // Single Case
        getAllCombinations(arr, idx + 1, tar - arr[idx], ans, combin);
        // Multiple Case
        getAllCombinations(arr, idx, tar - arr[idx], ans, combin);
        // Backtrack
        combin.remove(combin.size() - 1);
        // Skip Case
        getAllCombinations(arr, idx + 1, tar, ans, combin);
    }
}