package past;
import java.util.Scanner;

public class EncyclopediaOfParentheses {

    public static void main(String[] args) {

        int N;
        try (var sc = new Scanner(System.in)) {
            N = Integer.parseInt(sc.nextLine());
            if (N % 2 != 0) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        StringBuilder sb = new StringBuilder();
        String s;
        for (int bit = 0; bit < (1 << N); ++bit) {
            for (int i = N - 1; i >= 0; --i) {
                if ((bit & (1 << i)) == 0) {
                    sb.append("(");
                } else {
                    sb.append(")");
                }
            }
            s = sb.toString();
            if (isValid(s)) {
                System.out.println(s);
            }
            sb.delete(0, sb.length());
        }

    }

    private static boolean isValid(String s) {
        int score = 0;
        char[] cc = s.toCharArray();
        for (char c : cc) {
            if (c == '(') {
                ++score;
            } else if (c == ')') {
                --score;
            }
            if (score < 0) {
                return false;
            }
        }
        return score == 0;
    }

}
