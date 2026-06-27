class Solution {
    public int characterReplacement(String s, int k) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] freq=new int[26];
        int r=0;
        int l=0;
        int mf=0;
        int result=0;
        for(r=0;r<s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            mf=Math.max(mf,freq[ch-'A']);
            while((r-l+1)-mf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            result=Math.max(mf,r-l+1);
        }
        return result;
    }
}