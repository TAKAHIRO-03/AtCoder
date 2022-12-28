package past;

import java.util.LinkedList;
import java.util.Queue;
import past.TreeNode;

public class LinkedListCycle {

    public static void main(String[] args) {

//        var root = new past.TreeNode(4, new past.TreeNode(2), new past.TreeNode(7));
//        root.left.left = new past.TreeNode(1);
//        root.left.right = new past.TreeNode(3);
//        root.right.left = new past.TreeNode(6);
//        root.right.right = new past.TreeNode(9);
        var root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var cur = queue.poll();
            var tmpLeft = cur.left;
            cur.left = cur.right;
            cur.right = tmpLeft;
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
            System.out.println(cur);
        }

    }

}
