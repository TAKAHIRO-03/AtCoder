package past;

import java.util.ArrayList;
import java.util.List;

public class SumOfNodesWithEvenValuedGrandparent {

    private static int sum;

    public static void main(String[] args) {

        var root = new TreeNode(6,
            new TreeNode(7, new TreeNode(2),
                new TreeNode(7)),
            new TreeNode(8, new TreeNode(1),
                new TreeNode(3)));
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(5);

        recursive(root, null, null);

    }

    private static void recursive(TreeNode curr, TreeNode p, TreeNode gp) {
        if (curr == null) {
            return;
        }

        if (gp != null && gp.val % 2 == 0) {
            sum += curr.val;
        }

        recursive(curr.left, curr, p);
        recursive(curr.right, curr, p);
    }

}
