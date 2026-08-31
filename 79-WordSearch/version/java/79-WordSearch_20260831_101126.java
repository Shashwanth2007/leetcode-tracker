// Last updated: 8/31/2026, 10:11:26 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m - 1, j = n - 1, k = m + n - 1;
4
5        while (j >= 0) {
6            if (i >= 0 && nums1[i] > nums2[j])
7                nums1[k--] = nums1[i--];
8            else
9                nums1[k--] = nums2[j--];
10        }
11    }
12}