class Solution {
    public int arrangeCoins(int n) {
       long N = n; 
        return (int)((Math.sqrt(1 + 8 * N) - 1) / 2);
    }
}