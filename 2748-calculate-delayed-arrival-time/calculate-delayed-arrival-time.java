class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int total = arrivalTime + delayedTime ;
        if (total >= 24) {
            return total - 24 ;
        } 
        else {
            return total ;
        }

    }
}