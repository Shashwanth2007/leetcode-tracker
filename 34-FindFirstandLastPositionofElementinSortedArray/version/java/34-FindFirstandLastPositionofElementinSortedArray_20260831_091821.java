// Last updated: 8/31/2026, 9:18:21 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = find(nums, target, true);
4        int last = find(nums, target, false);
5
6        return new int[]{first, last};
7    }
8
9    int find(int[] nums, int target, boolean first) {
10        int l = 0, r = nums.length - 1;
11        int ans = -1;
12
13        while (l <= r) {
14            int mid = l + (r - l) / 2;
15
16            if (nums[mid] == target) {
17                ans = mid;
18
19                if (first)
20                    r = mid - 1;
21                else
22                    l = mid + 1;
23            } else if (nums[mid] < target) {
24                l = mid + 1;
25            } else {
26                r = mid - 1;
27            }
28        }
29
30        return ans;
31    }
32}