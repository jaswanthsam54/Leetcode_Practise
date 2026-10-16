class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] pref=new int[n];
        pref[0]=gain[0];
        int max=0;
        if(pref[0]>max){
            max=pref[0];
        }
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+gain[i];
            if(pref[i]>max){
                max=pref[i];
            }
        }
        return max;
    }
}