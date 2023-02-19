package past;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        var s = "cbbd";

        System.out.println(longestPalindrome(s));

    }

    public static String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        var letters = s.toCharArray();
        var n = s.length();
        var start = 0;
        var maxLen = 1;
        var i = 0;

        while (i < n) {
            var l = i;
            var r = i;
            while (r < n - 1 && letters[r] == letters[r + 1]) {
                r += 1;
            }
            i = r + 1;
            while (r < n - 1 && l > 0 && letters[r + 1] == letters[l - 1]) {
                l -= 1;
                r += 1;
            }
            if (maxLen < r - l + 1) {
                start = l;
                maxLen = r - l + 1;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static String findLongestPalindrome(String s, int depth) {

        var letters = s.toCharArray();
        var ans = "";

        for (int i = 0, len = letters.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (letters[i] == letters[j]) {
                    var diff = j - i;
                    if (2 < diff) {
                        var tmp = findLongestPalindrome(s.substring(i + 1, j), depth + 1);
                        if (tmp != null && (diff - 1) == tmp.length()) {
                            tmp = letters[i] + tmp + letters[j];
                            if (ans.length() < tmp.length()) {
                                ans = tmp;
                            }
                        } else if (0 < depth && tmp == null) {
                            return null;
                        }
                    } else if (2 == diff) {
                        var tmp = "" + letters[i] + letters[i + 1] + letters[j];
                        if (ans.length() < tmp.length()) {
                            ans = tmp;
                        }
                    } else {
                        var tmp = "" + letters[i] + letters[j];
                        if (ans.length() < tmp.length()) {
                            ans = tmp;
                        }
                    }
                }
            }
        }

        return ans.isBlank() ? null : ans;
    }


}
