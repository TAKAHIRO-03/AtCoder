package past;

import java.util.Scanner;

public class TaroSummerHoliday {

    private static int N;

    private static int[] A;

    public static void main(String[] args) {

        try (final var sc = new Scanner(System.in)) {

            N = sc.nextInt();

            sc.nextLine();
            A = new int[N + 1];
            for (int i = 1; i < N + 1; i++) {
                A[i] = sc.nextInt();
            }
            sc.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var dp1 = new int[N + 1];
        var dp2 = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            dp1[i] = dp2[i - 1] + A[i];
            dp2[i] = dp1[i - 1];
        }

        System.out.println(Math.max(dp1[N], dp2[N]));

    }

}
