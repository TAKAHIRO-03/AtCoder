package past;

import java.util.HashMap;
import java.util.Map;
import past.TreeNode;

public class CBTFPAIT {

    private static Map<Integer, Integer> M = new HashMap<>();

    public static void main(String[] args) {

        var preorder = new int[]{3, 9, 20, 15, 7};
        var inorder = new int[]{9, 3, 15, 20, 7};

        System.out.println(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            M.put(inorder[i], i);
        }
        return splitTree(preorder, 0, 0, inorder.length - 1);
    }

    private static TreeNode splitTree(int[] preorder, int preIndex, int ileft, int iright) {
        int val = preorder[preIndex], middle = M.get(val);
        TreeNode root = new TreeNode(val);
        if (middle > ileft) {
            root.left = splitTree(preorder, preIndex + 1, ileft, middle - 1);
        }
        if (middle < iright) {
            root.right = splitTree(preorder, preIndex + middle - ileft + 1, middle + 1, iright);
        }
        return root;
    }

}
