package past;

import java.util.TreeMap;

import past.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        var input = new ListNode(9, new ListNode(9, new ListNode(1)));
        var ans = deleteDuplicates(input);
        System.out.println(ans);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        var ans = head;
        var prev = head;
        while (head != null) {
            if (prev.val == head.val) {
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }

        return ans;
    }

}
