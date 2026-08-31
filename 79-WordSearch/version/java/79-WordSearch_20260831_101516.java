// Last updated: 8/31/2026, 10:15:16 AM
1class Solution {
2    public int numDecodings(String s) {
3        if (s.charAt(0) == '0') return 0;
4
5        int prev2 = 1;
6        int prev1 = 1;
7
8        for (int i = 1; i < s.length(); i++) {
9            int cur = 0;
10
11            if (s.charAt(i) != '0')
12                cur += prev1;
13
14            int num = Integer.parseInt(s.substring(i - 1, i + 1));
15
16            if (num >= 10 && num <= 26)
17                cur += prev2;
18
19            prev2 = prev1;
20            prev1 = cur;
21        }
22
23        return prev1;
24    }
25}