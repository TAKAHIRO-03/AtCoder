package past;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        var sum = 0;
        var ans = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            sum += nums[i];
            if (sum == k) {
                ans++;
            }
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }

}
