package past;

import java.util.Scanner;

public class CrossSum {
    public static void main(String[] args) {

        int H, W;
        int[][] A;
        int[] HH, WW;
        try (var sc = new Scanner(System.in)) {
            H = sc.nextInt();
            W = sc.nextInt();
            sc.nextLine();

            A = new int[H][W];
            HH = H < W ? new int[W] : new int[H]; // 縦の合計値
            WW = H < W ? new int[W] : new int[H]; // 横の合計値
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    // A[i][j] = sc.nextInt();
                    A[i][j] = Integer.parseInt(sc.next());
                    HH[j] += A[i][j];
                    WW[i] += A[i][j];
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int sum = HH[j] + WW[i] - A[i][j];
                sb.append(sum);
                if (j != W - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
