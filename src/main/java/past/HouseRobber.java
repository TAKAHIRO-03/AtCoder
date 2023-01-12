package past;

public class HouseRobber {

    public static void main(String[] args) {

        var nums = new int[]{2, 1, 1, 2};
        var n = nums.length;

        var ans = maxAmount(nums, n);
        System.out.println(ans);
    }

    private static int maxAmount(int nums[], int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        var v1 = nums[0];
        var v2 = Math.max(nums[0], nums[1]);
        var maxVal = 0;
        for (int i = 2; i < n; i++) {
            maxVal = Math.max(nums[i] + v1, v2);
            v1 = v2;
            v2 = maxVal;
        }
        return maxVal;
    }

}
