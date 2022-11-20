package past;

import java.util.Scanner;

public class MergeSort {

    private static int N;
    private static int[] A;
    private static int[] C;

    public static void main(String[] args) {

        try (final var sc = new Scanner(System.in)) {

            N = sc.nextInt();
            sc.nextLine();

            A = new int[N + 1];
            C = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // マージソート
        mergeSort(A, C, 1, N + 1);

        // 出力
        for (int i = 1; i <= N; i++) {
            System.out.println(A[i]);
        }

    }

    private static void mergeSort(int[] A, int[] C, int l, int r) {
        if (r - l == 1) {
            return;
        }

        // 2 つに分割した後、小さい配列をソート
        int m = (l + r) / 2;
        mergeSort(A, C, l, m);
        mergeSort(A, C, m, r);

        int c1 = l, c2 = m, cnt = 0;
        while (c1 != m || c2 != r) {
            if (c1 == m) {
                // 列 A' が空の場合
                C[cnt] = A[c2];
                c2++;
            } else if (c2 == r) {
                // 列 B' が空の場合
                C[cnt] = A[c1];
                c1++;
            } else {
                // そのいずれでもない場合
                if (A[c1] <= A[c2]) {
                    C[cnt] = A[c1];
                    c1++;
                } else {
                    C[cnt] = A[c2];
                    c2++;
                }
            }
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            A[l + i] = C[i];
        }
    }


}
