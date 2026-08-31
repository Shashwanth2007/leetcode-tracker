// Last updated: 8/31/2026, 9:47:55 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4
5        int top = 0, bottom = matrix.length - 1;
6        int left = 0, right = matrix[0].length - 1;
7
8        while (top <= bottom && left <= right) {
9            for (int j = left; j <= right; j++)
10                ans.add(matrix[top][j]);
11            top++;
12
13            for (int i = top; i <= bottom; i++)
14                ans.add(matrix[i][right]);
15            right--;
16
17            if (top <= bottom) {
18                for (int j = right; j >= left; j--)
19                    ans.add(matrix[bottom][j]);
20                bottom--;
21            }
22
23            if (left <= right) {
24                for (int i = bottom; i >= top; i--)
25                    ans.add(matrix[i][left]);
26                left++;
27            }
28        }
29
30        return ans;
31    }
32}