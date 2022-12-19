package past;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        var nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        var map = new HashMap<Integer, Integer>();

        var num = nums[0];
        var count = 1;
        map.put(nums[0], 1);
        for (int i = 1, len = nums.length; i < len; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                continue;
            }
            map.put(nums[i], (map.get(nums[i]) + 1));
            if (count < map.get(nums[i])) {
                num = nums[i];
                count = map.get(nums[i]);
            }
        }

        System.out.println(num);
    }

}
