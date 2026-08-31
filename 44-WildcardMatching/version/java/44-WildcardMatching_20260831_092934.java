// Last updated: 8/31/2026, 9:29:34 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length(), n = p.length();
4        boolean[][] dp = new boolean[m + 1][n + 1];
5
6        dp[0][0] = true;
7
8        for (int j = 1; j <= n; j++)
9            if (p.charAt(j - 1) == '*')
10                dp[0][j] = dp[0][j - 1];
11
12        for (int i = 1; i <= m; i++) {
13            for (int j = 1; j <= n; j++) {
14                char pc = p.charAt(j - 1);
15
16                if (pc == '?' || pc == s.charAt(i - 1))
17                    dp[i][j] = dp[i - 1][j - 1];
18                else if (pc == '*')
19                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
20            }
21        }
22
23        return dp[m][n];
24    }
25}