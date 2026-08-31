// Last updated: 8/31/2026, 10:07:59 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int max = 0;
5
6        for (int i = 0; i <= heights.length; i++) {
7            int h = i == heights.length ? 0 : heights[i];
8
9            while (!stack.isEmpty() && heights[stack.peek()] > h) {
10                int height = heights[stack.pop()];
11                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
12                max = Math.max(max, height * width);
13            }
14
15            stack.push(i);
16        }
17
18        return max;
19    }
20}