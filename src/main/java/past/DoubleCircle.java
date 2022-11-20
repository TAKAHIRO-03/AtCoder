package past;

import java.util.Random;

public class DoubleCircle {

    private static Random rand = new Random();

    private static int N = 1_000_000;

    public static void main(String[] args) {

        var ans = 0;
        for (int i = 1; i <= N; i++) {
            var px = rand.nextDouble() * 6.0; // 6まで
            var py = rand.nextDouble() * 9.0; // 9まで

            var toSmallCircle = Math.sqrt((px - 3.0) * (px - 3.0) + (py - 7.0) * (py - 7.0));
            if (toSmallCircle <= 2.0) {
                ans++;
                continue;
            }

            var toBigCircle = Math.sqrt((px - 3.0) * (px - 3.0) + (py - 3.0) * (py - 3.0));
            if (toBigCircle <= 3.0) {
                ans++;
            }
        }

        System.out.println(ans);
        System.out.println((double) ans / N);

    }

}
