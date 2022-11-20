package past;

import java.util.Scanner;

public class EducationalDPContest {

    private static int N;
    private static int[] H;

    public static void main(String[] args) {

        try (final var sc = new Scanner(System.in)) {

            N = sc.nextInt();
            sc.nextLine();

            H = new int[N];

            for (int i = 0; i < N; i++) {
                H[i] = sc.nextInt();
            }
            sc.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(H[0] - H[1]);
        for (int i = 2; i < N; i++) {
            var a = dp[i - 1] + Math.abs(H[i - 1] - H[i]);
            var b = dp[i - 2] + Math.abs(H[i - 2] - H[i]);
            dp[i] = Math.min(a, b);
        }

        System.out.println(dp[N - 1]);
    }
}