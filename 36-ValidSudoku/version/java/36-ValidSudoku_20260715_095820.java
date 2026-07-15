// Last updated: 15/07/2026, 09:58:20
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        for(int i=0;i<9;i++){
4            boolean[] seen=new boolean[9];
5            for(int j=0;j<9;j++){
6                if(board[i][j]!='.'){
7                    int n=board[i][j]-'1';
8                    if(seen[n]){
9                        return false;
10                    }
11                    seen[n]=true;
12                }
13            }
14        }
15        for(int j=0;j<9;j++){
16            boolean[] seen=new boolean[9];
17            for(int i=0;i<9;i++){
18                if(board[i][j]!='.'){
19                    int n=board[i][j]-'1';
20                    if(seen[n]){
21                        return false;
22                    }
23                    seen[n]=true;
24                }
25            }
26        }
27        for(int r=0;r<9;r=r+3){
28            for(int c=0;c<9;c=c+3){
29                boolean[] seen=new boolean[9];
30                for(int i=r;i<r+3;i++){
31                    for(int j=c;j<c+3;j++){
32                        if(board[i][j]!='.'){
33                            int n=board[i][j]-'1';
34                            if(seen[n]){
35                                return false;
36                            }
37                            seen[n]=true;
38                        }
39                    }
40                }
41            }
42        }
43        return true;
44    }
45}