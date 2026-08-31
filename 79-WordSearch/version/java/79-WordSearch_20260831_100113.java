// Last updated: 8/31/2026, 10:01:13 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int l = 0, r = nums.length - 1;
4
5        while (l <= r) {
6            int mid = l + (r - l) / 2;
7
8            if (nums[mid] == target) return true;
9
10            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
11                l++;
12                r--;
13            } else if (nums[l] <= nums[mid]) {
14                if (nums[l] <= target && target < nums[mid])
15                    r = mid - 1;
16                else
17                    l = mid + 1;
18            } else {
19                if (nums[mid] < target && target <= nums[r])
20                    l = mid + 1;
21                else
22                    r = mid - 1;
23            }
24        }
25
26        return false;
27    }
28}