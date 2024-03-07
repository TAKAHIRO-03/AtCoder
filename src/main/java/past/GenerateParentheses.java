package past;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    /**
     * 
     * 0 1 2 3 4 5
     * ■ ■ ■ □ □ □
     * 
     * 0 1 2 3 4 5
     * ■ ■ □ ■ □ □
     * 
     * 0 1 2 3 4 5
     * ■ ■ □ □ ■ □
     * 
     * 0 1 2 3 4 5
     * ■ □ ■ ■ □ □
     * 
     * 0 1 2 3 4 5
     * ■ □ ■ □ ■ □
     * 
     * 
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        var ans = new ArrayList<String>();
        dfs(n, n, "", ans);
        return ans;
    }

    public static void dfs(int left, int right, String path, List<String> ans) {

        if (left > right || left < 0 || right < 0) {
            return;
        }

        if (left == 0 && right == 0) {
            ans.add(path);
            return;
        }

        dfs(left - 1, right, path + '(', ans);
        dfs(left, right - 1, path + ')', ans);
    }

}
