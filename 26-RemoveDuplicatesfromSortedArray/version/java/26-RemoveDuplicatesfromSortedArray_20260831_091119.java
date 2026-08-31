// Last updated: 8/31/2026, 9:11:19 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1)
4            return Integer.MAX_VALUE;
5
6        long a = dividend;
7        long b = divisor;
8
9        boolean negative = (a < 0) ^ (b < 0);
10
11        a = Math.abs(a);
12        b = Math.abs(b);
13
14        long result = 0;
15
16        while (a >= b) {
17            long temp = b;
18            long multiple = 1;
19
20            while (a >= (temp << 1)) {
21                temp <<= 1;
22                multiple <<= 1;
23            }
24
25            a -= temp;
26            result += multiple;
27        }
28
29        if (negative)
30            result = -result;
31
32        return (int) result;
33    }
34}