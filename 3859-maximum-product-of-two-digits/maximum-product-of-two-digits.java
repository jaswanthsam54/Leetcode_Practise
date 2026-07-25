class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            int temp=n%10;
            list.add(temp);
            n=n/10;
        }
        Collections.sort(list);
        int size=list.size();
        return list.get(size-1)*list.get(size-2);
    }
}