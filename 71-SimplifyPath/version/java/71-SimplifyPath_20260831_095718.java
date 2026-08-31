// Last updated: 8/31/2026, 9:57:18 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length, n = matrix[0].length;
4        int l = 0, r = m * n - 1;
5
6        while (l <= r) {
7            int mid = l + (r - l) / 2;
8            int value = matrix[mid / n][mid % n];
9
10            if (value == target) return true;
11            if (value < target) l = mid + 1;
12            else r = mid - 1;
13        }
14
15        return false;
16    }
17}