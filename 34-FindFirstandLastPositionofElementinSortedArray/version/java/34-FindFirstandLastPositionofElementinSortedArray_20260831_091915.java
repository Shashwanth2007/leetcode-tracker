// Last updated: 8/31/2026, 9:19:15 AM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int l = 0, r = nums.length - 1;
4
5        while (l <= r) {
6            int mid = l + (r - l) / 2;
7
8            if (nums[mid] == target)
9                return mid;
10
11            if (nums[mid] < target)
12                l = mid + 1;
13            else
14                r = mid - 1;
15        }
16
17        return l;
18    }
19}