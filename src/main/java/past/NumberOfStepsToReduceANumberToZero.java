package past;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberToZero {

    private static int N;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            N = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var num = N;
        var step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }

        System.out.println(step);

    }

}
