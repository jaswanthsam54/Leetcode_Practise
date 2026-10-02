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

    public void nQueens(char[][] board, int row,
                        List<List<String>> result) {

        // base case
        if (row == board.length) {

            List<String> solution = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                solution.add(new String(board[i]));
            }

            result.add(solution);
            return;
        }

        // try every column
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // choose
                board[row][j] = 'Q';

                // recursion
                nQueens(board, row + 1, result);

                // backtracking
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0, result);

        return result;
    }
}