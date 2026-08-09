class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] right=new int[heights.length];
        int[] left=new int[heights.length];
        int max=0;
        Deque<Integer> rights=new ArrayDeque<>();
        Deque<Integer> lefts=new ArrayDeque<>();
        //Next Smaller right
        for(int i=heights.length-1;i>=0;i--){
            while(!rights.isEmpty()&&heights[rights.peek()]>=heights[i]){
                rights.pop();
            }
            if(rights.isEmpty()){
                right[i]=heights.length;
            }
            else{
                right[i]=rights.peek();
            }
            rights.push(i);
        }
        //Next Smaller left
        for(int i=0;i<heights.length;i++){
            while(!lefts.isEmpty()&&heights[lefts.peek()]>=heights[i]){
                lefts.pop();
            }
            if(lefts.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=lefts.peek();
            }
            lefts.push(i);
        }
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=right[i]-left[i]-1;
            int currarea=height*width;
            max=Math.max(currarea,max);
        }
        return max;
    }
}