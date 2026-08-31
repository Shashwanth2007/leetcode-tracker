// Last updated: 8/31/2026, 9:35:33 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        // Transpose
6        for (int i = 0; i < n; i++) {
7            for (int j = i; j < n; j++) {
8                int temp = matrix[i][j];
9                matrix[i][j] = matrix[j][i];
10                matrix[j][i] = temp;
11            }
12        }
13
14        // Reverse each row
15        for (int i = 0; i < n; i++) {
16            int l = 0, r = n - 1;
17
18            while (l < r) {
19                int temp = matrix[i][l];
20                matrix[i][l++] = matrix[i][r];
21                matrix[i][r--] = temp;
22            }
23        }
24    }
25}