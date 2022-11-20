package past;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        var root = new TreeNode(6, new TreeNode(7, new TreeNode(2), new TreeNode(7)),
            new TreeNode(8, new TreeNode(1), new TreeNode(3)));
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(5);

        var max = recursive(root);
        System.out.println(max);
    }

    private static int recursive(TreeNode root) {
        return 0;
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