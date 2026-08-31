// Last updated: 8/31/2026, 10:08:24 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix.length == 0) return 0;
4
5        int n = matrix[0].length;
6        int[] heights = new int[n];
7        int max = 0;
8
9        for (char[] row : matrix) {
10            for (int j = 0; j < n; j++)
11                heights[j] = row[j] == '1' ? heights[j] + 1 : 0;
12
13            max = Math.max(max, largest(heights));
14        }
15
16        return max;
17    }
18
19    int largest(int[] h) {
20        Stack<Integer> st = new Stack<>();
21        int max = 0;
22
23        for (int i = 0; i <= h.length; i++) {
24            int x = i == h.length ? 0 : h[i];
25
26            while (!st.isEmpty() && h[st.peek()] > x) {
27                int height = h[st.pop()];
28                int width = st.isEmpty() ? i : i - st.peek() - 1;
29                max = Math.max(max, height * width);
30            }
31
32            st.push(i);
33        }
34
35        return max;
36    }
37}