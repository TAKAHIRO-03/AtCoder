package past;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseInteger {

    public static void main(String[] args) {

        var ans = reverse(1534236469);
        System.out.println(ans);

    }

    public static int reverse(int x) {

        Queue<Integer> numbers = new LinkedList<>();
        var xx = Math.abs(x);
        while (xx > 0) {
            numbers.add(xx % 10);
            xx = xx / 10;
        }

        var ans = 0;
        var len = numbers.size();
        for (int i = len; 0 < i; i--) {
            if (len == i) {
                ans += (numbers.poll() * Math.pow(10, i - 1));
                continue;
            }
            if (Integer.MAX_VALUE == ans || Integer.MIN_VALUE == ans) {
                return 0;
            }
            ans += (numbers.poll() * Math.pow(10, i - 2) * 10);
        }

        return x < 0 ? ans * -1 : ans;
    }

}
