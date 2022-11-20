package past;

public class InsertIntoABinarySearchTree {

    public static void main(String[] args) {

        var root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        recursive(root, 5);
        System.out.println(root);
    }

    private static void recursive(TreeNode node, int val) {

        if (node == null) {
            return;
        }

        if (node.val < val) {
            if (node.right == null) {
                node.left = new TreeNode(val);
                return;
            }
            recursive(node.right, val);
        } else {
            if (node.left == null) {
                node.left = new TreeNode(val);
                return;
            }
            recursive(node.left, val);
        }

    }


    private static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "past.TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
        }
    }

}
