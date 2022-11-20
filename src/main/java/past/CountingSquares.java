package past;

import java.util.Scanner;

public class CountingSquares {
    private static long A, B, C, D, E, F;

    private static long MOD = 998244353;

    public static void main(String[] args) {

        try (final var scan = new Scanner(System.in)) {

            A = scan.nextLong();
            B = scan.nextLong();
            C = scan.nextLong();
            D = scan.nextLong();
            E = scan.nextLong();
            F = scan.nextLong();

            scan.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        long answer = ((A * B % MOD * C % MOD) - (D * E % MOD * F % MOD)) % MOD;

        System.out.println(answer);

    }

}
