package past;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        var s = new char[]{'h', 'e', 'l', 'l', 'o'};

        for (int i = 0, len = s.length / 2; i < len; i++) {
            var tmp1 = s[i];
            var tmp2 = s[s.length - 1 - i];
            s[i] = tmp2;
            s[s.length - 1 - i] = tmp1;
        }

        System.out.println(Arrays.toString(s));

    }

}
