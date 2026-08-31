// Last updated: 8/31/2026, 9:28:02 AM
1class Solution {
2    public int trap(int[] height) {
3        int l = 0, r = height.length - 1;
4        int leftMax = 0, rightMax = 0;
5        int ans = 0;
6
7        while (l < r) {
8            if (height[l] < height[r]) {
9                if (height[l] >= leftMax)
10                    leftMax = height[l];
11                else
12                    ans += leftMax - height[l];
13
14                l++;
15            } else {
16                if (height[r] >= rightMax)
17                    rightMax = height[r];
18                else
19                    ans += rightMax - height[r];
20
21                r--;
22            }
23        }
24
25        return ans;
26    }
27}