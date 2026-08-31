// Last updated: 8/31/2026, 9:47:35 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int cur = nums[0], max = nums[0];
4
5        for (int i = 1; i < nums.length; i++) {
6            cur = Math.max(nums[i], cur + nums[i]);
7            max = Math.max(max, cur);
8        }
9
10        return max;
11    }
12}