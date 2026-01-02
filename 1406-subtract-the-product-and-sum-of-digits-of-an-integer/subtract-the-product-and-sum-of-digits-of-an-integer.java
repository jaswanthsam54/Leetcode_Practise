class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0 ;
        int mul = 1 ;
        int nn ;
        while ( n != 0) {
            nn = n % 10 ;
            add = add + nn ;
            mul = mul * nn ;
            n = n / 10 ;
        }
        return mul - add ;
    }
}