package past;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static Map<Integer, Integer> map = new HashMap<>() {
        {
            put(0, 1);
        }
    };

    public static void main(String[] args) {

        var nums = new int[]{7, 5, 3};
        var A = 10;

        twoSum(nums, A);

    }

    public static int[] twoSum(int[] nums, int target) {

        var ans = new int[2];
        for (int i = 0, len = nums.length; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        Arrays.sort(ans);
        return ans;
    }

}
