package past;

import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        var nums = new int[]{1, 2, 3};

        var res = new LinkedList<List<Integer>>();
        dfs(nums, res, new LinkedList<>(), new boolean[nums.length]);
    }

    public static void dfs(int[] nums, List<List<Integer>> ans, List<Integer> curr,
        boolean[] visited) {

        if (curr.size() == nums.length) {
            ans.add(new LinkedList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                curr.add(nums[i]);
                dfs(nums, ans, curr, visited);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }

    }

}
