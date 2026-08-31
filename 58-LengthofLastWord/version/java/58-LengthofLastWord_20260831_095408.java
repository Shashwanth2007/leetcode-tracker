// Last updated: 8/31/2026, 9:54:08 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4
5        int i = a.length() - 1;
6        int j = b.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry;
11
12            if (i >= 0) sum += a.charAt(i--) - '0';
13            if (j >= 0) sum += b.charAt(j--) - '0';
14
15            sb.append(sum % 2);
16            carry = sum / 2;
17        }
18
19        return sb.reverse().toString();
20    }
21}