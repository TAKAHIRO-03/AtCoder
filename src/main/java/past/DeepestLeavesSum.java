package past;

import java.util.Arrays;

public class DeepestLeavesSum {

    private static int MAX_DEPTH;
    public static void main(String[] args) {

//        var root = new past.TreeNode(1, new past.TreeNode(2), new past.TreeNode(3));
//        root.left.left = new past.TreeNode(4, new past.TreeNode(7), null);
//        root.left.right = new past.TreeNode(5);
//        root.right.right = new past.TreeNode(6, null, new past.TreeNode(8));
        var root = new TreeNode(37, new TreeNode(97), new TreeNode(18));
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(18);

        var ans = new int[10001];
        recursive(root, ans, 0, 0);

        System.out.println(ans[MAX_DEPTH]);
    }

    private static void recursive(TreeNode node, int[] nums, int leftDepth, int rightDepth) {

        if (node == null) {
            return;
        }

        recursive(node.left, nums, ++leftDepth, rightDepth);
        recursive(node.right, nums, leftDepth, ++rightDepth);

        if (leftDepth < rightDepth) {
            nums[rightDepth] += node.val;
        } else {
            nums[leftDepth] += node.val;
        }

        MAX_DEPTH = Math.max(MAX_DEPTH, leftDepth);
        MAX_DEPTH = Math.max(MAX_DEPTH, rightDepth);
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

        TreeNode(int val, TreeNode left,
            TreeNode right) {
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
