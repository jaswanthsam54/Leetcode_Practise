class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st=new HashMap<>();
        HashMap<Character,Character> ts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char fs=s.charAt(i);
            char ss=t.charAt(i);
            if(st.containsKey(fs)){
                if(st.get(fs)!=ss){
                    return false;
                }
                }else{
                    st.put(fs,ss);
                }
            if(ts.containsKey(ss)){
                if(ts.get(ss)!=fs){
                    return false;
                }
            }
                else{
                    ts.put(ss,fs);
                }
        }
        return true;
    }
}