class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();
        for(int i = 1 ; i < n ; i++){
            int key = expected[i];
            int j = i - 1;
            while(j >= 0  && expected[j] > key){
                expected[j+1] = expected[j];
                j--;
            }
            expected[j+1] =  key ;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}