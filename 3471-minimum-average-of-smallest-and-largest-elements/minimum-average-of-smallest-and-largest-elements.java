class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min=Double.MAX_VALUE;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            double avg=(double)(nums[l]+nums[r])/2;
            if(avg<min) min=avg;
            l++;
            r--;
        }
        return min;
    }
}