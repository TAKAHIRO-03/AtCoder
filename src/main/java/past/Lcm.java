package past;

import java.util.Scanner;

public class Lcm {

    private static int N;

    private static int[] A;

    /**
     * N個の最小公倍数を求めなさい。
     *
     * @param args
     */
    public static void main(String[] args) {

        try (final var sc = new Scanner(System.in)) {

            N = sc.nextInt();
            sc.nextLine();

            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var lcm = A[0] < A[1] ? A[1] * A[0] / gcd(A[1], A[0]) : A[0] * A[1] / gcd(A[0], A[1]);
        for (int i = 2; i < N; i++) {
            lcm = lcm * A[i] / gcd(lcm, A[i]);
        }

        System.out.println(lcm);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
