package past;

import java.util.HashMap;
import java.util.Map;
import past.TreeNode;

public class FlattenBinaryTreeToLinkedList {

    private static int count = 0;

    private static Map<Integer, TreeNode> order = new HashMap<>();

    public static void main(String[] args) {

        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flatten(root);

        System.out.println("");
    }

    public static void flatten(TreeNode root) {

        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }

        if (root.left != null) {
            // Move left recursively
            flatten(root.left);
            // Store the node.right in Node named tempNode
            var tempNode = root.right;
            root.right = root.left;
            root.left = null;
            // Find the position to insert the stored value
            var curr = root.right;
            while (curr.right != null) {
                curr = curr.right;
            }
            // Insert the stored value
            curr.right = tempNode;
        }

        // Now call the same function for node.right
        flatten(root.right);
    }


    public static void recursive(TreeNode node) {

        if (node != null) {
            recursive(node.left);
            recursive(node.right);
        }

        System.out.println("");

    }

}
