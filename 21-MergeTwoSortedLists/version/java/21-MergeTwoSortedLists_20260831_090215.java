// Last updated: 8/31/2026, 9:02:15 AM
1class Solution {
2    public ListNode mergeTwoLists(ListNode a, ListNode b) {
3        ListNode dummy = new ListNode(0);
4        ListNode cur = dummy;
5
6        while (a != null && b != null) {
7            if (a.val <= b.val) {
8                cur.next = a;
9                a = a.next;
10            } else {
11                cur.next = b;
12                b = b.next;
13            }
14            cur = cur.next;
15        }
16
17        cur.next = (a != null) ? a : b;
18        return dummy.next;
19    }
20}