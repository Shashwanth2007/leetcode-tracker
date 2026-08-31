// Last updated: 8/31/2026, 9:55:19 AM
1class Solution {
2    public int mySqrt(int x) {
3        long l = 0, r = x;
4
5        while (l <= r) {
6            long mid = (l + r) / 2;
7
8            if (mid * mid <= x)
9                l = mid + 1;
10            else
11                r = mid - 1;
12        }
13
14        return (int) r;
15    }
16}