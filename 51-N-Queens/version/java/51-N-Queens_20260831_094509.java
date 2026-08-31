// Last updated: 8/31/2026, 9:45:09 AM
1class Solution {
2    List<List<String>> ans = new ArrayList<>();
3
4    public List<List<String>> solveNQueens(int n) {
5        char[][] b = new char[n][n];
6        for (char[] r : b) Arrays.fill(r, '.');
7        backtrack(b, 0);
8        return ans;
9    }
10
11    void backtrack(char[][] b, int row) {
12        if (row == b.length) {
13            List<String> list = new ArrayList<>();
14            for (char[] r : b) list.add(new String(r));
15            ans.add(list);
16            return;
17        }
18
19        for (int col = 0; col < b.length; col++) {
20            if (valid(b, row, col)) {
21                b[row][col] = 'Q';
22                backtrack(b, row + 1);
23                b[row][col] = '.';
24            }
25        }
26    }
27
28    boolean valid(char[][] b, int r, int c) {
29        for (int i = 0; i < r; i++)
30            if (b[i][c] == 'Q') return false;
31
32        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
33            if (b[i][j] == 'Q') return false;
34
35        for (int i = r - 1, j = c + 1; i >= 0 && j < b.length; i--, j++)
36            if (b[i][j] == 'Q') return false;
37
38        return true;
39    }
40}