package past;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {

    private static int N;
    private static int[] nums;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            N = sc.nextInt();
            nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var ans = 0;
        for (var n : nums) {
            ans ^= n;
        }

        System.out.println(ans);
    }
}
