package past;

import java.util.HashMap;
import java.util.Map;
import past.TreeNode;

public class PathSumIII {

    private static Map<Integer, Integer> preSum = new HashMap<>() {
        {
            put(0, 1);
        }
    };

    public static void main(String[] args) {

        var root = new TreeNode(10, new TreeNode(5), new TreeNode(-3));
        root.left.left = new TreeNode(3, new TreeNode(3), new TreeNode(-2));
        root.left.right = new TreeNode(2, null, new TreeNode(1));
        root.right.right = new TreeNode(11);

        var ans = recursive(root, 0, 8);
        System.out.println(ans);
    }

    public static int pathSum(TreeNode root, int targetSum) {
        return 0;
    }

    public static int recursive(TreeNode node, int currSum, int targetSum) {

        if (node == null) {
            return 0;
        }

        currSum += node.val;
        var res = preSum.getOrDefault(currSum - targetSum, 0);

        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
        res += recursive(node.left, currSum, targetSum) + recursive(node.right, currSum, targetSum);
        preSum.put(currSum, preSum.get(currSum) - 1);

        return res;
    }

}
