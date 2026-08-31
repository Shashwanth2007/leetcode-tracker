// Last updated: 8/31/2026, 9:48:13 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int reach = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > reach) return false;
7            reach = Math.max(reach, i + nums[i]);
8        }
9
10        return true;
11    }
12}