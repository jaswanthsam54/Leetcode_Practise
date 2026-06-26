class Solution {
    public int maxVowels(String s, int k) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(k==0||k==s.length()){
            return k;
        }
        String v="aeiou";
        int count=0;
        int result=0;
        for(int i=0;i<k;i++){
            if(v.indexOf(s.charAt(i))!=-1){
                count++;
            }
            result=count;
        }
        int l=0;
        for(int r=k;r<s.length();r++){
            l=r-k;
            if(v.indexOf(s.charAt(r))!=-1){
                count++;
            }
            if(v.indexOf(s.charAt(l))!=-1){
                count--;
            }
            result=Math.max(result,count);
        }
        return result;
    }
}