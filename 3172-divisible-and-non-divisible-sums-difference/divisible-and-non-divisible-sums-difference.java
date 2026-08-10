class Solution {
    public int differenceOfSums(int n, int m) {
        int div1=0;
        int div2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                div1+=i;
            }
            else{
                div2+=i;
            }
        }
        return div1-div2;
    }
}