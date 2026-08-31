// Last updated: 8/31/2026, 9:54:27 AM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> ans = new ArrayList<>();
4        int i = 0;
5
6        while (i < words.length) {
7            int j = i;
8            int len = 0;
9
10            while (j < words.length &&
11                   len + words[j].length() + (j - i) <= maxWidth) {
12                len += words[j].length();
13                j++;
14            }
15
16            int spaces = maxWidth - len;
17            int gaps = j - i - 1;
18
19            StringBuilder line = new StringBuilder();
20
21            if (j == words.length || gaps == 0) {
22                for (int k = i; k < j; k++) {
23                    if (k > i) line.append(' ');
24                    line.append(words[k]);
25                }
26                while (line.length() < maxWidth) line.append(' ');
27            } else {
28                int each = spaces / gaps;
29                int extra = spaces % gaps;
30
31                for (int k = i; k < j; k++) {
32                    line.append(words[k]);
33
34                    if (k < j - 1) {
35                        int count = each + (k - i < extra ? 1 : 0);
36                        for (int x = 0; x < count; x++)
37                            line.append(' ');
38                    }
39                }
40            }
41
42            ans.add(line.toString());
43            i = j;
44        }
45
46        return ans;
47    }
48}