class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq=new int[26];
        for(char c:sentence.toCharArray()){
            freq[c-'a']++;
        }
        for(int count:freq){
            if(count==0){
                return false;
            }
        }
        return true;
    }
}