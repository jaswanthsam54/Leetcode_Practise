class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCounts = new int[k];
        remainderCounts[0] = 1;
        
        int count = 0;
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            
            if (remainder < 0) {
                remainder += k;
            }
            
            count += remainderCounts[remainder];
            remainderCounts[remainder]++;
        }
        
        return count;
    }
}