package past;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBST {

    private static List<Integer> ans = new ArrayList<>();
    private static int low;
    private static int high;

    public static void main(String[] args) {

        var root = new TreeNode(10, new TreeNode(5), new TreeNode(15));
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        low = 7;
        high = 15;

        recursive(root);

        System.out.println(ans.stream().mapToInt(x -> x).sum());

    }

    private static void recursive(TreeNode node) {

        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (low <= node.val && node.val <= high) {
                ans.add(node.val);
            }
            return;
        }

        if (low <= node.val && node.val <= high) {
            ans.add(node.val);
        }
        recursive(node.left);
        recursive(node.right);

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
