class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> st = new ArrayList<>(); 
        int strow = 0;
        int endrow = matrix.length - 1;
        int stcol = 0;
        int endcol = matrix[0].length - 1;
        while (strow <= endrow && stcol <= endcol) {
            // top row
            for (int j = stcol; j <= endcol; j++) {
                st.add(matrix[strow][j]);
            }
            // right column
            for (int i = strow + 1; i <= endrow; i++) {
                st.add(matrix[i][endcol]);
            }
            // bottom row
            if (strow < endrow) { // avoid double counting if only one row left
                for (int j = endcol - 1; j >= stcol; j--) {
                    st.add(matrix[endrow][j]);
                }
            }
            // left column
            if (stcol < endcol) { // avoid double counting if only one column left
                for (int i = endrow - 1; i > strow; i--) {
                    st.add(matrix[i][stcol]);
                }
            }
            // shrink boundaries
            strow++;
            endrow--;
            stcol++;
            endcol--;
        }
        return st;
    }
}
