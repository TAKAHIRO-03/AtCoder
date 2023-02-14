package past;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {

        var s = "3[a2[c]]";
//        var s = "3[a]2[bc]";
        var ans = decodeString(s);
        System.out.println(ans);
    }

    public static String decodeString(String s) {

        var stack = new Stack<String>();
        var curNum = Integer.valueOf(0);
        var curLetter = "";

        for (int i = 1, len = s.length(); i <= len; i++) {
            var letter = s.substring(i - 1, i);

            if (letter.equals("[")) {
                stack.add(curLetter);
                stack.add(curNum.toString());
                curLetter = "";
                curNum = 0;
            } else if (letter.equals("]")) {
                var num = Integer.valueOf(stack.pop());
                var multipleLetter = "";
                for (int j = 0; j < num; j++) {
                    multipleLetter += curLetter;
                }
                var preStr = stack.pop();
                curLetter = preStr + multipleLetter;
            } else if (letter.matches("\\d")) {
                curNum = curNum * 10 + Integer.valueOf(letter);
            } else {
                curLetter += letter;
            }

        }

        return curLetter;
    }


}
