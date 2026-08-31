// Last updated: 8/31/2026, 9:49:28 AM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> ans = new ArrayList<>();
4        int i = 0;
5
6        while (i < intervals.length && intervals[i][1] < newInterval[0])
7            ans.add(intervals[i++]);
8
9        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
10            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
11            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
12            i++;
13        }
14
15        ans.add(newInterval);
16
17        while (i < intervals.length)
18            ans.add(intervals[i++]);
19
20        return ans.toArray(new int[ans.size()][]);
21    }
22}