class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        findsub(nums,0,new ArrayList<>(),result);
        return result;
    }
    public void findsub(int[] nums,int i,List<Integer> curr,List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        findsub(nums,i+1,curr,result);
        curr.remove(curr.size()-1);
        findsub(nums,i+1,curr,result);
    }
}