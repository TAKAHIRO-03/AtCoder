package past;

import past.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {

        var l1 = new ListNode(9, new ListNode(9, new ListNode(1)));
        var l2 = new ListNode(1);

        var ans = addTwoNumbers(l1, l2);

        System.out.println(ans);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        var ans = new ListNode();
        recursive(l1, l2, ans);

        return ans;
    }

    public static void recursive(ListNode l1, ListNode l2, ListNode ans) {

        if (l1 == null && l2 == null) {
            return;
        }

        if (l1 == null && l2 != null) {
            var sum = ans.val + l2.val;
            if (10 <= sum) {
                ans.val = sum - 10;
                ans.next = new ListNode(1);
            } else {
                ans.val = sum;
                ans.next = new ListNode();
                if (l2.next == null) {
                    ans.next = null;
                    return;
                }
            }
            recursive(null, l2.next, ans.next);
        }

        if (l1 != null && l2 == null) {
            var sum = ans.val + l1.val;
            if (10 <= sum) {
                ans.val = sum - 10;
                ans.next = new ListNode(1);
            } else {
                ans.val = sum;
                ans.next = new ListNode();
                if (l1.next == null) {
                    ans.next = null;
                    return;
                }
            }
            recursive(l1.next, null, ans.next);
        }

        if (l1 != null && l2 != null) {
            var sum = l1.val + l2.val;
            if (10 <= sum) {
                ans.val += sum - 10;
                ans.next = new ListNode(1);
            } else {
                ans.val += sum;
                ans.next = new ListNode();
                if (l1.next == null && l2.next == null) {
                    ans.next = null;
                    return;
                }
            }
            recursive(l1.next, l2.next, ans.next);
        }

    }

}
