package past;

import java.util.HashMap;
import past.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var map = new HashMap<ListNode, ListNode>();
        while (headA != null) {
            map.put(headA, headA);
            headA = headA.next;
        }
        while (headB != null) {
            if(map.containsKey(headB)) {
                return headB;
            }
            map.put(headB, headB);
            headB = headB.next;
        }
        return null;
    }

}
