package past;

import java.util.LinkedList;
import java.util.Queue;
import past.TreeNode;

public class MergeTwoBinaryTrees2 {

    public static void main(String[] args) {

        var node1 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        node1.left.left = new TreeNode(5);

        var node2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);

        var newNode = new TreeNode(node1.val + node2.val);

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(node1);

        Queue<TreeNode> q2 = new LinkedList<>();
        q2.add(node2);

        while (!q1.isEmpty() && !q2.isEmpty()) {

            var curr1 = !q1.isEmpty() ? q1.poll() : new TreeNode();
            if (curr1.left != null) {
                q1.add(curr1.left);
                newNode.left = new TreeNode(curr1.left.val);
            }
            if (curr1.right != null) {
                q1.add(curr1.right);
                newNode.right = new TreeNode(curr1.right.val);
            }

            var curr2 = !q2.isEmpty() ? q2.poll() : new TreeNode();
            if (curr2.left != null) {
                q2.add(curr2.left);
                if (newNode.left != null) {
                    newNode.left.val += curr2.left.val;
                } else {
                    newNode.left = new TreeNode(curr2.left.val);
                }
            }
            if (curr2.right != null) {
                q2.add(curr2.right);
                if (newNode.right != null) {
                    newNode.right.val += curr2.right.val;
                } else {
                    newNode.right = new TreeNode(curr2.right.val);
                }
            }

        }

        System.out.println(newNode);

    }

//    private static TreeNode recursive(TreeNode node1, TreeNode node2, TreeNode newNode) {
//        if (node1 == null && node2 == null) {
//            return null;
//        }
//
////        if (node1.left == null && node2.left == null) {
////            // do nothing
////        } else {
////            var val1 = node1.left != null ? node1.left.val : 0;
////            var val2 = node2.left != null ? node2.left.val : 0;
////            newNode.left = new TreeNode(val1 + val2);
////        }
////
////        if (node2.right == null && node2.right == null) {
////            // do nothing
////        } else {
////            var val1 = node1.right != null ? node1.right.val : 0;
////            var val2 = node2.right != null ? node2.right.val : 0;
////            newNode.right = new TreeNode(val1 + val2);
////        }
//
//        var leftNode = recursive(node1.left, node2.left, newNode);
//        var rightNode = recursive(node1.right, node2.right, newNode);
//
//    }


}
