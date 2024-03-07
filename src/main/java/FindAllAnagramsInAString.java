import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {

        var targetSortedAry = p.toCharArray();
        Arrays.sort(targetSortedAry);

        var ans = new ArrayList<Integer>();
        var targetLen = p.length();
        var sAry = s.toCharArray();

        var tmp = "";
        var tmpAry = new char[] {};
        for (int i = 0, sLen = s.length(); i < sLen; i++) {
            if (sAry[i] != targetSortedAry[0]) {
                if (sAry[i] != targetSortedAry[targetSortedAry.length - 1]) {
                    continue;
                }
            }
            if (targetLen + i <= sLen) {
                tmp = "";
                for (int j = i; j < i + targetLen; j++) {
                    tmp += sAry[j];
                }
                tmpAry = tmp.toCharArray();
                Arrays.sort(tmpAry);
                if (Arrays.equals(targetSortedAry, tmpAry)) {
                    if (!ans.contains(i)) {
                        ans.add(i);
                    }
                }
            }

            if (i < targetLen - 1) {
                continue;
            }
            tmp = "";
            for (int j = i; i - (targetLen - 1) <= j; j--) {
                tmp += sAry[j];
            }
            tmpAry = tmp.toCharArray();
            Arrays.sort(tmpAry);
            if (Arrays.equals(targetSortedAry, tmpAry)) {
                if (!ans.contains(i - (targetLen - 1))) {
                    ans.add(i - (targetLen - 1));
                }
            }

        }

        Collections.sort(ans);
        return ans;
    }
}
