// Last updated: 8/31/2026, 9:16:39 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        while (i >= 0 && nums[i] >= nums[i + 1])
6            i--;
7
8        if (i >= 0) {
9            int j = nums.length - 1;
10
11            while (nums[j] <= nums[i])
12                j--;
13
14            int temp = nums[i];
15            nums[i] = nums[j];
16            nums[j] = temp;
17        }
18
19        int l = i + 1, r = nums.length - 1;
20
21        while (l < r) {
22            int temp = nums[l];
23            nums[l++] = nums[r];
24            nums[r--] = temp;
25        }
26    }
27}