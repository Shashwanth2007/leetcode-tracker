// Last updated: 8/31/2026, 10:00:24 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++)
4            for (int j = 0; j < board[0].length; j++)
5                if (dfs(board, word, i, j, 0))
6                    return true;
7
8        return false;
9    }
10
11    boolean dfs(char[][] b, String w, int r, int c, int k) {
12        if (k == w.length()) return true;
13
14        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length ||
15            b[r][c] != w.charAt(k))
16            return false;
17
18        char temp = b[r][c];
19        b[r][c] = '#';
20
21        boolean found = dfs(b, w, r + 1, c, k + 1) ||
22                        dfs(b, w, r - 1, c, k + 1) ||
23                        dfs(b, w, r, c + 1, k + 1) ||
24                        dfs(b, w, r, c - 1, k + 1);
25
26        b[r][c] = temp;
27
28        return found;
29    }
30}