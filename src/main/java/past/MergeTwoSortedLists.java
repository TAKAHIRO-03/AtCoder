package past;

import past.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        var list1 = new ListNode(1, new ListNode(2));
        var list2 = new ListNode(1, new ListNode(3));

        list1.next.next = new ListNode(4);
        list2.next.next = new ListNode(4);

        var ans = mergeTwoLists(list1, list2);
        System.out.println(ans);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list2.val <= list1.val) {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }

    }


}
