package past;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {

        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        var root = new TreeNode(1, new TreeNode(2), null);

        var s = new DiameterOfBinaryTree.Solution();
        var ans = s.diameterOfBinaryTree(root);

        System.out.println(ans);
    }


    private static class Solution {

        private int ans = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            this.dfs(root);
            return this.ans;
        }

        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }

            var left = dfs(root.left);
            var right = dfs(root.right);
            this.ans = Math.max(this.ans, left + right);

            return Math.max(left, right) + 1;
        }
    }

}
