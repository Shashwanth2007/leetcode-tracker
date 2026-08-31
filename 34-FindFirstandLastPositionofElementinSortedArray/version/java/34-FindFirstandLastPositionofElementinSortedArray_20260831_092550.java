// Last updated: 8/31/2026, 9:25:50 AM
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4
5        for (int k = 1; k < n; k++) {
6            StringBuilder next = new StringBuilder();
7
8            for (int i = 0; i < s.length();) {
9                int j = i;
10
11                while (j < s.length() && s.charAt(j) == s.charAt(i))
12                    j++;
13
14                next.append(j - i);
15                next.append(s.charAt(i));
16
17                i = j;
18            }
19
20            s = next.toString();
21        }
22
23        return s;
24    }
25}