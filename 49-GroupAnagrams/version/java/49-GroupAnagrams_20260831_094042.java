// Last updated: 8/31/2026, 9:40:42 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5        List<Integer> result = new ArrayList<>();
6
7        if (s == null || words == null || words.length == 0)
8            return result;
9
10        int wordLen = words[0].length();
11        int wordCount = words.length;
12        int totalLen = wordLen * wordCount;
13
14        if (s.length() < totalLen)
15            return result;
16
17        Map<String, Integer> need = new HashMap<>();
18
19        for (String word : words) {
20            need.put(word, need.getOrDefault(word, 0) + 1);
21        }
22
23        // Try every possible starting offset inside a word
24        for (int offset = 0; offset < wordLen; offset++) {
25            int left = offset;
26            int right = offset;
27            int count = 0;
28
29            Map<String, Integer> seen = new HashMap<>();
30
31            while (right + wordLen <= s.length()) {
32                String word = s.substring(right, right + wordLen);
33                right += wordLen;
34
35                if (!need.containsKey(word)) {
36                    seen.clear();
37                    count = 0;
38                    left = right;
39                    continue;
40                }
41
42                seen.put(word, seen.getOrDefault(word, 0) + 1);
43                count++;
44
45                // Too many occurrences of this word
46                while (seen.get(word) > need.get(word)) {
47                    String leftWord = s.substring(left, left + wordLen);
48                    seen.put(leftWord, seen.get(leftWord) - 1);
49                    left += wordLen;
50                    count--;
51                }
52
53                // Found all words
54                if (count == wordCount) {
55                    result.add(left);
56
57                    String leftWord = s.substring(left, left + wordLen);
58                    seen.put(leftWord, seen.get(leftWord) - 1);
59                    left += wordLen;
60                    count--;
61                }
62            }
63        }
64
65        return result;
66    }
67}