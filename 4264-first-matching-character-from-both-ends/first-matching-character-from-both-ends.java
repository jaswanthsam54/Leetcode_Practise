class Solution {
    public int firstMatchingIndex(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            char a=s.charAt(l);
            char b=s.charAt(r);
            if(a==b){
                return l;
            }
            l++;
            r--;
        }
        return -1;
    }
}