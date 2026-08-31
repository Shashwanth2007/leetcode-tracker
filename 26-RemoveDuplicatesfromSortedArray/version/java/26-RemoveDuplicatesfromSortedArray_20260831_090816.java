// Last updated: 8/31/2026, 9:08:16 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int j = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] != val)
7                nums[j++] = nums[i];
8        }
9
10        return j;
11    }
12}