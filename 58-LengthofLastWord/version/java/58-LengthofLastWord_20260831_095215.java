// Last updated: 8/31/2026, 9:52:15 AM
1class Solution {
2    public boolean isNumber(String s) {
3        s = s.trim();
4
5        boolean digit = false, dot = false, exp = false, expDigit = true;
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9
10            if (Character.isDigit(c)) {
11                digit = true;
12                if (exp) expDigit = true;
13            } else if (c == '.') {
14                if (dot || exp) return false;
15                dot = true;
16            } else if (c == 'e' || c == 'E') {
17                if (exp || !digit) return false;
18                exp = true;
19                expDigit = false;
20            } else if (c == '+' || c == '-') {
21                if (i != 0 && s.charAt(i - 1) != 'e' &&
22                    s.charAt(i - 1) != 'E')
23                    return false;
24            } else {
25                return false;
26            }
27        }
28
29        return digit && expDigit;
30    }
31}