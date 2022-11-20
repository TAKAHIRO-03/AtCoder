package past;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        var nums = new int[]{0, 1, 0, 3, 12};
//
//        if (nums.length == 1 && nums[0] == 0) {
//            return;
//        }

        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < len - 1; j++) {
                    if (nums[j + 1] == 0) {
                        continue;
                    }
                    nums[i] = nums[j + 1];
                    nums[j + 1] = 0;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
