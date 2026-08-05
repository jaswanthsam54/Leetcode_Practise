class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> sk=new ArrayDeque<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(!sk.isEmpty()&&sk.peek()==ch){
                sk.pop();
            }
            else{
                sk.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!sk.isEmpty()){
            sb.append(sk.pop());
        }
        return sb.toString();
    }
}
