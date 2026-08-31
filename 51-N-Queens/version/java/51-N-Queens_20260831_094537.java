// Last updated: 8/31/2026, 9:45:37 AM
1class Solution {
2    int count = 0;
3
4    public int totalNQueens(int n) {
5        solve(n, 0, new boolean[n],
6              new boolean[2 * n],
7              new boolean[2 * n]);
8        return count;
9    }
10
11    void solve(int n, int r, boolean[] col, boolean[] d1, boolean[] d2) {
12        if (r == n) {
13            count++;
14            return;
15        }
16
17        for (int c = 0; c < n; c++) {
18            if (col[c] || d1[r + c] || d2[r - c + n]) continue;
19
20            col[c] = d1[r + c] = d2[r - c + n] = true;
21            solve(n, r + 1, col, d1, d2);
22            col[c] = d1[r + c] = d2[r - c + n] = false;
23        }
24    }
25}