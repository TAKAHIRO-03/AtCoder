package past;

import past.TreeNode;

import static java.util.Objects.*;

public class MergeTwoBinaryTrees {

    private static TreeNode newNode = new TreeNode();

    public static void main(String[] args) {

        var node1 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        node1.left.left = new TreeNode(5);

        var node2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);

        recursive(node1, node2);

        System.out.println(node1);
    }

    private static TreeNode recursive(TreeNode node1, TreeNode node2) {

        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }

        node1.val = node1.val + node2.val;
        node1.left = recursive(node1.left, node2.left);
        node1.right = recursive(node1.right, node2.right);

        return node1;
    }
}
