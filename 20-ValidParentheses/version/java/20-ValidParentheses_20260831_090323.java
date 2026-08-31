// Last updated: 8/31/2026, 9:03:23 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ans = new ArrayList<>();
4        backtrack(ans, "", 0, 0, n);
5        return ans;
6    }
7
8    void backtrack(List<String> ans, String s, int open, int close, int n) {
9        if (s.length() == 2 * n) {
10            ans.add(s);
11            return;
12        }
13
14        if (open < n)
15            backtrack(ans, s + "(", open + 1, close, n);
16
17        if (close < open)
18            backtrack(ans, s + ")", open, close + 1, n);
19    }
20}