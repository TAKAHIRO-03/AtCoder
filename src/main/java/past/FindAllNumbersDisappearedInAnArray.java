package past;

import java.util.LinkedList;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {

        var nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        var numsIndex = new int[nums.length + 1];
        for (int i = 0, len = nums.length; i < len; i++) {
            numsIndex[nums[i]] = 1;
        }
        var ans = new LinkedList<Integer>();
        for (int i = 1, len = nums.length; i <= len; i++) {
            if (numsIndex[i] != 1) {
                ans.add(i);
            }
        }

        System.out.println(ans);

    }

}
