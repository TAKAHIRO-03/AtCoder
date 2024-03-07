package past;

public class SearchInsertPosition {

    public static void main(String[] args) {

        var nums = new int[] { 1, 3, 5, 6 };
        var ans = searchInsert(nums, 2);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left <= right ? left : right;
    }

}
