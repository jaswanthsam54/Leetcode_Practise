class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int index=q.poll();
            tickets[index]--;
            time++;
            if(index==k&&tickets[index]==0){
                return time;
            }
            if(tickets[index]>0){
                q.offer(index);
            }
        }
        return time;
    }
}