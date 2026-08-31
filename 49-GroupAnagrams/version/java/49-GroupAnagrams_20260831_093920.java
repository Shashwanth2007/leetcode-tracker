// Last updated: 8/31/2026, 9:39:20 AM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode temp = head;
5
6        // Check whether k nodes are available
7        for (int i = 0; i < k; i++) {
8            if (temp == null) {
9                return head;
10            }
11            temp = temp.next;
12        }
13
14        // Reverse k nodes
15        ListNode prev = null;
16        ListNode curr = head;
17
18        for (int i = 0; i < k; i++) {
19            ListNode next = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = next;
23        }
24
25        // Connect remaining groups
26        head.next = reverseKGroup(curr, k);
27
28        return prev;
29    }
30}