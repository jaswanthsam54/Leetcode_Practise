class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();

        int st=0;
        for(int end=0;end<=arr.length;end++){
            if(end==arr.length||arr[end]==' '){
                reverse(arr,st,end-1);
                st=end+1;
            }
        }
        return new String(arr);
    }
     private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}