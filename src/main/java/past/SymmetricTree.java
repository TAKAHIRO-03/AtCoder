package past;

import past.TreeNode;

public class SymmetricTree {


    public static void main(String[] args) {
//        var root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);

        var root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        var result = recursive(root, root);
        System.out.println(result);
    }

    private static boolean recursive(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null && node1.val == node2.val) {
            return recursive(node1.left, node2.right) && recursive(node1.right, node2.left);
        }

        return false;
    }


}
