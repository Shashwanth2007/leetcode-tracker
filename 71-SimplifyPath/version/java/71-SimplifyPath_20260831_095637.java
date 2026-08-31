// Last updated: 8/31/2026, 9:56:37 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length(), n = word2.length();
4        int[] dp = new int[n + 1];
5
6        for (int j = 0; j <= n; j++)
7            dp[j] = j;
8
9        for (int i = 1; i <= m; i++) {
10            int prev = dp[0];
11            dp[0] = i;
12
13            for (int j = 1; j <= n; j++) {
14                int temp = dp[j];
15
16                if (word1.charAt(i - 1) == word2.charAt(j - 1))
17                    dp[j] = prev;
18                else
19                    dp[j] = 1 + Math.min(prev,
20                            Math.min(dp[j], dp[j - 1]));
21
22                prev = temp;
23            }
24        }
25
26        return dp[n];
27    }
28}