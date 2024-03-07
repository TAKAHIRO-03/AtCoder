package past;

public class RunningSumOf1DArray {

    public static int[] runningSum(int[] nums) {
        var n = nums.length;
        var ans = new int[n];
        ans[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }

}
