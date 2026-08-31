// Last updated: 8/31/2026, 9:56:01 AM
1class Solution {
2    public String simplifyPath(String path) {
3        String[] parts = path.split("/");
4        Deque<String> stack = new ArrayDeque<>();
5
6        for (String p : parts) {
7            if (p.equals("") || p.equals(".")) continue;
8
9            if (p.equals("..")) {
10                if (!stack.isEmpty()) stack.pop();
11            } else {
12                stack.push(p);
13            }
14        }
15
16        StringBuilder ans = new StringBuilder();
17
18        while (!stack.isEmpty())
19            ans.append("/").append(stack.removeLast());
20
21        return ans.length() == 0 ? "/" : ans.toString();
22    }
23}