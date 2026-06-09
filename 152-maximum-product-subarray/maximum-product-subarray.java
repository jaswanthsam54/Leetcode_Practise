class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0){
            return  0;
        }
        int maxp=nums[0];
        int minp=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxp;
                maxp=minp;
                minp=temp;
            }
            maxp=Math.max(curr,maxp*curr);
            minp=Math.min(curr,minp*curr);
            result=Math.max(result,maxp);
            
        }
        return result;
    }
}