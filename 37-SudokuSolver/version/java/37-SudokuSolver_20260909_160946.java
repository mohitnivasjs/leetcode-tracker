// Last updated: 09/09/2026, 16:09:46
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    public boolean solve(char[][] board) {
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9
10                if (board[i][j] == '.') {
11
12                    for (char num = '1'; num <= '9'; num++) {
13
14                        if (isValid(board, i, j, num)) {
15                            board[i][j] = num;
16
17                            if (solve(board))
18                                return true;
19
20                            board[i][j] = '.';
21                        }
22                    }
23
24                    return false;
25                }
26            }
27        }
28
29        return true;
30    }
31
32    public boolean isValid(char[][] board, int row, int col, char num) {
33
34        for (int i = 0; i < 9; i++) {
35
36            if (board[row][i] == num)
37                return false;
38
39            if (board[i][col] == num)
40                return false;
41
42            int r = 3 * (row / 3) + i / 3;
43            int c = 3 * (col / 3) + i % 3;
44
45            if (board[r][c] == num)
46                return false;
47        }
48
49        return true;
50    }
51}