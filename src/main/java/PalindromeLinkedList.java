import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import past.ListNode;

public class PalindromeLinkedList {

    public static void main(String[] args) {

//        var head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
//        var head = new ListNode(1, new ListNode(2, new ListNode(1)));
        var head = new ListNode(1, new ListNode(2));

        var ans = isPalindrome(head);
        System.out.println(ans);
    }

    public static boolean isPalindrome(ListNode head) {

        var list = new ArrayDeque<Integer>();
        var stack = new Stack<Integer>();
        while (head != null) {
            list.add(head.val);
            stack.add(head.val);
            head = head.next;
        }

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.poll().intValue() != stack.pop().intValue()) {
                return false;
            }
        }

        return true;
    }

}
