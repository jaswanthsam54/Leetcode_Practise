class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] pattern=new int[26];
        int[] window=new int[26];
        for(char c:s1.toCharArray()){
            pattern[c-'a']++;
        }
        int winsize=s1.length();
        for(int i=0;i<winsize;i++){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(pattern,window)){
            return true;
        }
        for(int i=winsize;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-winsize)-'a']--;
            if(Arrays.equals(pattern,window)){
                return true;
            }
        }
        return false;
        
    }
}