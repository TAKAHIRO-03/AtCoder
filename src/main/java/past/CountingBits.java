package past;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {

    private static int N;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            N = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var ans = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            ans[i] = ans[i / 2] + i % 2;
        }

        System.out.println(Arrays.toString(ans));
    }
}
