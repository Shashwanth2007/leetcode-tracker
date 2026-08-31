// Last updated: 8/31/2026, 9:24:00 AM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    boolean solve(char[][] board) {
7        for (int r = 0; r < 9; r++) {
8            for (int c = 0; c < 9; c++) {
9                if (board[r][c] == '.') {
10                    for (char n = '1'; n <= '9'; n++) {
11                        if (valid(board, r, c, n)) {
12                            board[r][c] = n;
13
14                            if (solve(board))
15                                return true;
16
17                            board[r][c] = '.';
18                        }
19                    }
20                    return false;
21                }
22            }
23        }
24        return true;
25    }
26
27    boolean valid(char[][] b, int r, int c, char n) {
28        for (int i = 0; i < 9; i++) {
29            if (b[r][i] == n || b[i][c] == n)
30                return false;
31
32            int rr = (r / 3) * 3 + i / 3;
33            int cc = (c / 3) * 3 + i % 3;
34
35            if (b[rr][cc] == n)
36                return false;
37        }
38
39        return true;
40    }
41}