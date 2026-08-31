// Last updated: 8/31/2026, 9:36:21 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long power = n;
4
5        if (power < 0) {
6            x = 1 / x;
7            power = -power;
8        }
9
10        double ans = 1;
11
12        while (power > 0) {
13            if ((power & 1) == 1)
14                ans *= x;
15
16            x *= x;
17            power /= 2;
18        }
19
20        return ans;
21    }
22}