class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a=s.toCharArray();
        int l=0;
        int r=a.length-1;
        while(l<r){
            if(a[l]!=a[r]){
                char small=(char)Math.min(a[l],a[r]);
                a[l]=small;
                a[r]=small;
            }
            l++;
            r--;
        }
        return new String(a);
    }
}