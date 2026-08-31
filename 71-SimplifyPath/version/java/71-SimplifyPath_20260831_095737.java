// Last updated: 8/31/2026, 9:57:37 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0, mid = 0, high = nums.length - 1;
4
5        while (mid <= high) {
6            if (nums[mid] == 0) {
7                int t = nums[low];
8                nums[low++] = nums[mid];
9                nums[mid++] = t;
10            } else if (nums[mid] == 1) {
11                mid++;
12            } else {
13                int t = nums[mid];
14                nums[mid] = nums[high];
15                nums[high--] = t;
16            }
17        }
18    }
19}