package past;

public class TargetSum {

    public static void main(String[] args) {

        var nums = new int[]{1, 1, 1, 1, 1};
        var target = 3;
        var ans = findTargetSumWays(nums, target);

        System.out.println(ans);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        var sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (target > sum || -target < -sum || (target + sum) % 2 == 1) {
            return 0;
        }

        int[] dp = new int[(target + sum) / 2 + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = dp.length - 1; i >= num; i--) {
                dp[i] += dp[i - num]; // Crux
            }
        }

        return dp[dp.length - 1];
    }

}
