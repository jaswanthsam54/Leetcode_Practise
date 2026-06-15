class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i < n - 3; i++) {

            // Skip duplicate a
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            for(int j = i + 1; j < n - 2; j++) {

                // Skip duplicate b
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while(left < right) {

                    long sum =
                        (long)nums[i] +
                        nums[j] +
                        nums[left] +
                        nums[right];

                    if(sum < target) {
                        left++;
                    }
                    else if(sum > target) {
                        right--;
                    }
                    else {

                        ans.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        // Skip duplicate left
                        while(left < right &&
                              nums[left] == nums[left + 1])
                            left++;

                        // Skip duplicate right
                        while(left < right &&
                              nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}