package past;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        var numRows = 5;
        var ans = generate(numRows);
        System.out.println(ans);

    }

    public static List<List<Integer>> generate(int numRows) {
        var ans = new LinkedList<List<Integer>>();
        ans.add(List.of(1));
        if (numRows == 1) {
            return ans;
        } else if (1 < numRows) {
            ans.add(List.of(1, 1));
        }

        for (int i = 2; i < numRows; i++) {
            var prevNums = ans.get(i - 1);
            var nums = new LinkedList<Integer>();
            nums.add(1);

            for (int j = 0, len = prevNums.size() - 1; j < len; j++) {
                nums.add(prevNums.get(j) + prevNums.get(j + 1));
            }

            nums.add(1);
            ans.add(nums);
        }

        return ans;
    }
}
