// Last updated: 8/31/2026, 9:17:36 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int l = 0, r = nums.length - 1;
4
5        while (l <= r) {
6            int mid = l + (r - l) / 2;
7
8            if (nums[mid] == target)
9                return mid;
10
11            if (nums[l] <= nums[mid]) {
12                if (nums[l] <= target && target < nums[mid])
13                    r = mid - 1;
14                else
15                    l = mid + 1;
16            } else {
17                if (nums[mid] < target && target <= nums[r])
18                    l = mid + 1;
19                else
20                    r = mid - 1;
21            }
22        }
23
24        return -1;
25    }
26}