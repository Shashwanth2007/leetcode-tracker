// Last updated: 8/31/2026, 9:59:01 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) {
4            return "";
5        }
6
7        int[] count = new int[128];
8
9        for (char c : t.toCharArray()) {
10            count[c]++;
11        }
12
13        int left = 0;
14        int required = t.length();
15        int minLength = Integer.MAX_VALUE;
16        int start = 0;
17
18        for (int right = 0; right < s.length(); right++) {
19            char c = s.charAt(right);
20
21            if (count[c] > 0) {
22                required--;
23            }
24
25            count[c]--;
26
27            while (required == 0) {
28                if (right - left + 1 < minLength) {
29                    minLength = right - left + 1;
30                    start = left;
31                }
32
33                char leftChar = s.charAt(left);
34                count[leftChar]++;
35
36                if (count[leftChar] > 0) {
37                    required++;
38                }
39
40                left++;
41            }
42        }
43
44        if (minLength == Integer.MAX_VALUE) {
45            return "";
46        }
47
48        return s.substring(start, start + minLength);
49    }
50}