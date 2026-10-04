class Solution {
    private boolean sudukoSolver(char[][] board,int row,int col){
        //Base
        if(row==9){
            return true;
        }
        //Recursive Case 
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        
        //Not a valid Place
        if(board[row][col]!='.'){
            return sudukoSolver(board,nextrow,nextcol);
        }
        
        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(sudukoSolver(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    
    public boolean isSafe(char[][] board,int row,int col,char digit){
        //Row & Col Check
        for(int i=0;i<9;i++){
            if(board[i][col]==digit||board[row][i]==digit){
                return false;
            }   
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        sudukoSolver(board,0,0);
    }
}