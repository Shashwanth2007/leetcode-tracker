// Last updated: 8/31/2026, 9:23:05 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] row = new boolean[9][9];
4        boolean[][] col = new boolean[9][9];
5        boolean[][] box = new boolean[9][9];
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9                if (board[i][j] == '.') continue;
10
11                int n = board[i][j] - '1';
12                int b = (i / 3) * 3 + j / 3;
13
14                if (row[i][n] || col[j][n] || box[b][n])
15                    return false;
16
17                row[i][n] = col[j][n] = box[b][n] = true;
18            }
19        }
20
21        return true;
22    }
23}