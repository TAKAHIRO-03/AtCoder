package past;

public class MaximumSubarray {

    public static void main(String[] args) {

        var nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        var len = nums.length;
        var dp = new int[len];
        dp[0] = nums[0];
        var ans = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(dp[i], ans);
        }

        System.out.println(ans);
    }

}
