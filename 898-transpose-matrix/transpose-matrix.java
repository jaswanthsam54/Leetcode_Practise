class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] t = new int[c][r];
        int i ;
        int j ;
        for (i = 0; i < r ; i++) {
            for (j = 0 ; j < c ; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }
}