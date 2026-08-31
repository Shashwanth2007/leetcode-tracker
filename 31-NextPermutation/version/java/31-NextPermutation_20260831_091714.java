// Last updated: 8/31/2026, 9:17:14 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        st.push(-1);
5
6        int ans = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) == '(') {
10                st.push(i);
11            } else {
12                st.pop();
13
14                if (st.isEmpty())
15                    st.push(i);
16                else
17                    ans = Math.max(ans, i - st.peek());
18            }
19        }
20
21        return ans;
22    }
23}