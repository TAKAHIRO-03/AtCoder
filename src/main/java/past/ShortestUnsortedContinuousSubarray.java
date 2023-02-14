package past;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args) {

        var nums = new int[]{1, 3, 2, 4, 5};
        var ans = findUnsortedSubarray(nums);

        System.out.println(ans);
    }

    public static int findUnsortedSubarray(int[] nums) {

        var sorted = Arrays.stream(nums).sorted().toArray();
        var startIndex = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] != sorted[i]) {
                startIndex = i;
                break;
            }
        }

        var lastIndex = 0;
        for (int i = nums.length - 1; 0 < i; i--) {
            if (nums[i] != sorted[i]) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex < startIndex) {
            return 0;
        }

        return lastIndex - startIndex + 1;
    }

}
