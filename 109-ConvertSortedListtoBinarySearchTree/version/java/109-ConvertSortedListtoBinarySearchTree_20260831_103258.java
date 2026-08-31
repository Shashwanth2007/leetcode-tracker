// Last updated: 8/31/2026, 10:32:58 AM
1class Solution {
2    public TreeNode sortedListToBST(ListNode head) {
3        if (head == null) return null;
4        if (head.next == null) return new TreeNode(head.val);
5
6        ListNode slow = head, fast = head, prev = null;
7
8        while (fast != null && fast.next != null) {
9            prev = slow;
10            slow = slow.next;
11            fast = fast.next.next;
12        }
13
14        prev.next = null;
15
16        TreeNode root = new TreeNode(slow.val);
17        root.left = sortedListToBST(head);
18        root.right = sortedListToBST(slow.next);
19
20        return root;
21    }
22}