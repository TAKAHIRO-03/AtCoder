package past;

import java.util.Scanner;

public class FindTakahashi {

    private static int N;
    private static int[] H;

    public static void main(String[] args) {

        try (final var scan = new Scanner(System.in)) {

            N = scan.nextInt();
            scan.nextLine();

            H = new int[N + 1];
            for (int i = 1; i < N + 1; i++) {
                H[i] = scan.nextInt();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int max = 0;
        int answer = 0;
        for (int i = 1, len = H.length; i < len; i++) {
            if (max <= H[i]) {
                max = H[i];
                answer = i;
            }
        }

        System.out.println(answer);

    }

}
