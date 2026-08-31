// Last updated: 8/31/2026, 9:50:09 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] a = new int[n][n];
4        int num = 1;
5        int top = 0, bottom = n - 1, left = 0, right = n - 1;
6
7        while (top <= bottom) {
8            for (int j = left; j <= right; j++)
9                a[top][j] = num++;
10            top++;
11
12            for (int i = top; i <= bottom; i++)
13                a[i][right] = num++;
14            right--;
15
16            if (top <= bottom) {
17                for (int j = right; j >= left; j--)
18                    a[bottom][j] = num++;
19                bottom--;
20            }
21
22            if (left <= right) {
23                for (int i = bottom; i >= top; i--)
24                    a[i][left] = num++;
25                left++;
26            }
27        }
28
29        return a;
30    }
31}