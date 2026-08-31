// Last updated: 8/31/2026, 10:00:53 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4
5        for (int x : nums) {
6            if (k < 2 || x != nums[k - 2])
7                nums[k++] = x;
8        }
9
10        return k;
11    }
12}