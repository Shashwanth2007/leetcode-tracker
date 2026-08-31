// Last updated: 8/31/2026, 9:48:38 AM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> ans = new ArrayList<>();
6
7        for (int[] in : intervals) {
8            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < in[0]) {
9                ans.add(in);
10            } else {
11                ans.get(ans.size() - 1)[1] =
12                    Math.max(ans.get(ans.size() - 1)[1], in[1]);
13            }
14        }
15
16        return ans.toArray(new int[ans.size()][]);
17    }
18}