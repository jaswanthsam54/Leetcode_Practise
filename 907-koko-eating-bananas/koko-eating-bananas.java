class Solution {
    public boolean canFinish(int[] piles,int h,int speed){
        long totalhours=0;
        for(int pile:piles){
            totalhours+=(pile + speed - 1)/speed;
        }
        return totalhours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        int result =high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}