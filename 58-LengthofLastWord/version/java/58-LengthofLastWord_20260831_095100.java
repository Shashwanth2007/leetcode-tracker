// Last updated: 8/31/2026, 9:51:00 AM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[] dp = new int[n];
4        Arrays.fill(dp, 1);
5
6        for (int i = 1; i < m; i++)
7            for (int j = 1; j < n; j++)
8                dp[j] += dp[j - 1];
9
10        return dp[n - 1];
11    }
12}