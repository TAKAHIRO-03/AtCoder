package past;

public class ClimbingStairs {

    public static void main(String[] args) {

        var n = 6;

        if (n == 1) {
            System.out.println(1);
            return;
        } else if (n == 2) {
            System.out.println(2);
            return;
        }

        var ary = new int[n + 1];
        ary[1] = 1;
        ary[2] = 2;
        for (int i = 3; i <= n; i++) {
            ary[i] = ary[i - 1] + ary[i - 2];
        }

        System.out.println(ary[n]);
    }

}
