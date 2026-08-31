// Last updated: 8/31/2026, 9:51:19 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] grid) {
3        int n = grid[0].length;
4        int[] dp = new int[n];
5
6        dp[0] = grid[0][0] == 1 ? 0 : 1;
7
8        for (int[] row : grid) {
9            for (int j = 0; j < n; j++) {
10                if (row[j] == 1)
11                    dp[j] = 0;
12                else if (j > 0)
13                    dp[j] += dp[j - 1];
14            }
15        }
16
17        return dp[n - 1];
18    }
19}