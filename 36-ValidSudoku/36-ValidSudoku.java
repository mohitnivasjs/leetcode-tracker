// Last updated: 15/07/2026, 15:00:37
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            boolean[] seen=new boolean[9];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int n=board[i][j]-'1';
                    if(seen[n]){
                        return false;
                    }
                    seen[n]=true;
                }
            }
        }
        for(int j=0;j<9;j++){
            boolean[] seen=new boolean[9];
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                    int n=board[i][j]-'1';
                    if(seen[n]){
                        return false;
                    }
                    seen[n]=true;
                }
            }
        }
        for(int r=0;r<9;r=r+3){
            for(int c=0;c<9;c=c+3){
                boolean[] seen=new boolean[9];
                for(int i=r;i<r+3;i++){
                    for(int j=c;j<c+3;j++){
                        if(board[i][j]!='.'){
                            int n=board[i][j]-'1';
                            if(seen[n]){
                                return false;
                            }
                            seen[n]=true;
                        }
                    }
                }
            }
        }
        return true;
    }
}