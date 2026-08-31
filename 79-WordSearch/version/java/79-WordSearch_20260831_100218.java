// Last updated: 8/31/2026, 10:02:18 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        while (head != null) {
9            boolean duplicate = false;
10
11            while (head.next != null &&
12                   head.val == head.next.val) {
13                duplicate = true;
14                head = head.next;
15            }
16
17            if (duplicate)
18                prev.next = head.next;
19            else
20                prev = prev.next;
21
22            head = head.next;
23        }
24
25        return dummy.next;
26    }
27}