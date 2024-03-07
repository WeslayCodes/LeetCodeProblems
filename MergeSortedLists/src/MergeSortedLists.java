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
 * MergeSortedLists.java
 *
 * Merges two sorted lists together and maintains sort.
 */
class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode curNode = newList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curNode.next = list1;
                list1 = list1.next;
            } else {
                curNode.next = list2;
                list2 = list2.next;
            }

            curNode = curNode.next;
        }

        // Appends remaining nodes
        if (list1 != null) {
            curNode.next = list1;
        } else if (list2 != null) {
            curNode.next = list2;
        }

        return newList.next;
    }
}