class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

/**
 * RemoveNodeEndList.java
 *
 * Removes the node that's nth from the end of a linked list.
 */
class RemoveNodeEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head; // Node before n
        ListNode fast = head; // Node after n

        // Loops until fast node set to earliest possible value after n
        for (int i=0; i<n; i++) {
            fast = fast.next;
        }

        // If the end of the list has been hit, return head without its first node
        if (fast == null) {
            return head.next;
        }

        // Loop until end of list hit.
        // Resulting slow node will be node before n.
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Cut n out of linked list
        slow.next = slow.next.next;

        return head;
    }
}