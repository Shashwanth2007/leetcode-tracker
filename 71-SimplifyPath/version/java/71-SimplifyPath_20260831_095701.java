// Last updated: 8/31/2026, 9:57:01 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        boolean row = false, col = false;
5
6        for (int i = 0; i < m; i++)
7            if (matrix[i][0] == 0) col = true;
8
9        for (int j = 0; j < n; j++)
10            if (matrix[0][j] == 0) row = true;
11
12        for (int i = 1; i < m; i++)
13            for (int j = 1; j < n; j++)
14                if (matrix[i][j] == 0) {
15                    matrix[i][0] = 0;
16                    matrix[0][j] = 0;
17                }
18
19        for (int i = 1; i < m; i++)
20            for (int j = 1; j < n; j++)
21                if (matrix[i][0] == 0 || matrix[0][j] == 0)
22                    matrix[i][j] = 0;
23
24        if (row)
25            Arrays.fill(matrix[0], 0);
26
27        if (col)
28            for (int i = 0; i < m; i++)
29                matrix[i][0] = 0;
30    }
31}