package past;

import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayInTheGivenOrder {

    private static int N;

    private static int[] nums;

    private static int[] index;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {

            N = sc.nextInt();

            nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            sc.nextLine();

            index = new int[N];
            for (int i = 0; i < N; i++) {
                index[i] = sc.nextInt();
            }
            sc.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var ans = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = N - 2; index[i] <= j; j--) {
                ans[j + 1] = ans[j];
            }
            ans[index[i]] = nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }

//    private static void recursive(int i, int[] ans) {
//        if (i == N - 2) {
//            return;
//        }
//        i++;
//        recursive(i, ans);
//        ans[i + 1] = ans[i];
//    }

}
