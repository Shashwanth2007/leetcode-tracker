// Last updated: 8/31/2026, 9:07:53 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) return 0;
4
5        int j = 1;
6
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] != nums[i - 1])
9                nums[j++] = nums[i];
10        }
11
12        return j;
13    }
14}