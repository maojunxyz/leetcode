package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MergeTwoLinkedLists {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2, node1);
        ListNode list1 = new ListNode(1, node2);
        ListNode node11 = new ListNode(4);
        ListNode node33 = new ListNode(3, node11);
        ListNode list2 = new ListNode(1, node33);
        ListNode node = mergeTwoLists(list1, list2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    /**
     * Use iteratively Time: O(n) Space: O(n)
     * 
     * @param list1
     * @param list2
     * @return ListNode
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final ListNode root = new ListNode();
        ListNode prev = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 == null ? list2 : list1;
        return root.next;

    }
}