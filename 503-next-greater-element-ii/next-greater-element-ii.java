class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!s.isEmpty()&&s.peek()<=nums[idx]){
                s.pop();
            }
            if(s.isEmpty()){
                result[idx]=-1;
            }
            else{
                result[idx]=s.peek();
            }
            s.push(nums[idx]);
        }
        return result;
        
    }
}