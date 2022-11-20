package past;

import java.util.Scanner;

public class Rightmost {

    private static char[] S;

    public static void main(String[] args) {

        try (final var scan = new Scanner(System.in)) {
            S = scan.nextLine().toCharArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int position = -1;
        for (int i = 0, len = S.length; i < len; i++) {
            if (S[i] == 'a') {
                position = i;
            }
        }

        if (0 <= position) {
            System.out.println(position + 1);
        } else {
            System.out.println(position);
        }

    }

}
