class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s=new Stack<>();
        int[] arr=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            while(!s.isEmpty()&&prices[s.peek()]>prices[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                arr[i]=prices[i]-prices[s.peek()];
            }
            else{
                arr[i]=prices[i];
            }
            s.push(i);
        }
        return arr;
    }
}