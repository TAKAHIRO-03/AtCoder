package past;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ScoreSumQueries {
    public static void main(String[] args) {

        int N, Q;
        int[] points1, points2;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(bf.readLine());
            points1 = new int[N + 1];
            points2 = new int[N + 1];
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 1; i <= N; i++) {
                String[] s = bf.readLine().split(" ");
                if (s[0].equals("1")) {
                    sum1 += Integer.parseInt(s[1]);
                } else {
                    sum2 += Integer.parseInt(s[1]);
                }
                points1[i] = sum1;
                points2[i] = sum2;
            }

            StringBuilder ans = new StringBuilder();
            Q = Integer.parseInt(bf.readLine());
            for (int i = 0; i < Q; i++) {
                int[] lines = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int L = lines[0];
                int R = lines[1];
                ans.append(points1[R] - points1[L - 1]);
                ans.append(" ");
                ans.append(points2[R] - points2[L - 1]);
                ans.append("\n");
            }

            System.out.print(ans.toString());

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }
}
