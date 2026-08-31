// Last updated: 8/31/2026, 9:28:57 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0"))
4            return "0";
5
6        int[] a = new int[num1.length() + num2.length()];
7
8        for (int i = num1.length() - 1; i >= 0; i--) {
9            for (int j = num2.length() - 1; j >= 0; j--) {
10                int p = i + j + 1;
11                int value = (num1.charAt(i) - '0') *
12                            (num2.charAt(j) - '0') + a[p];
13
14                a[p] = value % 10;
15                a[p - 1] += value / 10;
16            }
17        }
18
19        StringBuilder sb = new StringBuilder();
20
21        for (int x : a) {
22            if (sb.length() > 0 || x != 0)
23                sb.append(x);
24        }
25
26        return sb.toString();
27    }
28}