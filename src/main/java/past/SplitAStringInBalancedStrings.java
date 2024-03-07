package past;
import java.util.HashMap;
import java.util.Map;

public class SplitAStringInBalancedStrings {

    private Map<Character, Integer> map = new HashMap<>() {
        {
            put('R', 0);
            put('L', 0);
        }
    };

    public static void main(String[] args) {

        // var input = "RLRRLLRLRL";
        // var input = "RLRRRLLRLL";
        // var input = "LLLLRRRR";
        var input = "LLLLRLLRRLLRLRLRLRLRRLLRRLLRLRRRRLLRRLLLRLRRRLRRLLRLRRRRLLRLRLRLRRLRLRLLLRLLRRLRLRRRRRLLRRRLRRLLRLLRLLLRLRLLLLLRLLLLLLRRLLLRRRRRRLRRLRLRRLLRLRRRRRRLRRRRRLLRRLLRRLRLLRRRRLRRRRLRLRLLRRRLLLLRRLLLLRRLRRRLLRRRRRRLRLLLRLRRLRLLLRRRLRLLRRLRLRLLLRRLLLLRRLRLRRLRLRRRRLRLRLRLRRLLRRLRLRLLLRLRRRLRRRLRRLRLLLRLLRRRRRLRLLLLRRLLRLLLRRLLRRLLLLLLRLLRRRRRRLRRLLLRRLLLLRRLRRLLLLLRRRRLRLRRLRLLRLLLRLLRLLLRLLRLRLRLLLRLLLLL";

        new SplitAStringInBalancedStrings().balancedStringSplit(input);

    }

    public int balancedStringSplit(String s) {

        var letters = s.toCharArray();
        var ans = 0;
        var count = 0;
        for (int i = 0, len = letters.length; i < len; i++) {

            if('L' == letters[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                ans++;
            }

        }

        return ans;
    }
}
