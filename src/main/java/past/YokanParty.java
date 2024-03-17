package past;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YokanParty {
    public static void main(String[] args) {

        int N, L, K;
        int[] A;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] firstLine = bf.readLine().split(" ");
            N = Integer.parseInt(firstLine[0]);
            L = Integer.parseInt(firstLine[1]);
            K = Integer.parseInt(bf.readLine());

            String[] thirdLine = bf.readLine().split(" ");
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(thirdLine[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        long left = -1, right = L + 1;
        while (right - left > 1) {
            long mid = (left + right) / 2;
            if (check(L, N, K, A, mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.println(left);
    }

    private static boolean check(int L, int N, int K, int[] A, long mid) {
        long num = 0; // 何個に切れたか
        long pre = 0; // 前回の切れ目
        for (int i = 0; i < N; ++i) {
            // mid を超えたら切断
            if (A[i] - pre >= mid) {
                ++num;
                pre = A[i];
            }
        }
        // 最後のピースが mid 以上なら加算
        if (L - pre >= mid) {
            ++num;
        }

        return (num >= K + 1);
    }

}