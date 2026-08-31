// Last updated: 8/31/2026, 10:20:41 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        if (s1.length() + s2.length() != s3.length())
4            return false;
5
6        boolean[] dp = new boolean[s2.length() + 1];
7        dp[0] = true;
8
9        for (int j = 1; j <= s2.length(); j++)
10            dp[j] = dp[j - 1] &&
11                    s2.charAt(j - 1) == s3.charAt(j - 1);
12
13        for (int i = 1; i <= s1.length(); i++) {
14            dp[0] = dp[0] &&
15                    s1.charAt(i - 1) == s3.charAt(i - 1);
16
17            for (int j = 1; j <= s2.length(); j++) {
18                dp[j] =
19                    (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
20                    (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
21            }
22        }
23
24        return dp[s2.length()];
25    }
26}