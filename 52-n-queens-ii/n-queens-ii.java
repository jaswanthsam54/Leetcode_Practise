import java.util.Arrays;

class Solution {

    public boolean isSafe(char[][] board, int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public int nQueens(char[][] board, int row) {

        // base case: reached the end, found 1 valid solution
        if (row == board.length) {
            return 1;
        }

        int count = 0;

        // try every column
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // choose
                board[row][j] = 'Q';

                // recursion - accumulate valid solutions from sub-branches
                count += nQueens(board, row + 1);

                // backtracking
                board[row][j] = '.';
            }
        }

        return count;
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        return nQueens(board, 0);
    }
}