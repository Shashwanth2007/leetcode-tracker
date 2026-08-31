// Last updated: 8/31/2026, 10:08:56 AM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode small = new ListNode(0);
4        ListNode large = new ListNode(0);
5
6        ListNode s = small, l = large;
7
8        while (head != null) {
9            if (head.val < x) {
10                s.next = head;
11                s = s.next;
12            } else {
13                l.next = head;
14                l = l.next;
15            }
16
17            head = head.next;
18        }
19
20        l.next = null;
21        s.next = large.next;
22
23        return small.next;
24    }
25}