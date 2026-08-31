// Last updated: 8/31/2026, 10:20:24 AM
1class Solution {
2    public int numTrees(int n) {
3        long[] dp = new long[n + 1];
4        dp[0] = dp[1] = 1;
5
6        for (int nodes = 2; nodes <= n; nodes++) {
7            for (int root = 1; root <= nodes; root++) {
8                dp[nodes] += dp[root - 1] * dp[nodes - root];
9            }
10        }
11
12        return (int) dp[n];
13    }
14}