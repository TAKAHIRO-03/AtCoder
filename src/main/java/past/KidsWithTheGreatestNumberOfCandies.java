package past;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {

    private static int[] candies;

    private static int extraCandies;

    public static void main(String[] args) {

        candies = new int[]{2, 3, 5, 1, 3};
        extraCandies = 3;

        var max = Arrays.stream(candies).max().getAsInt();
        var ans = new LinkedList<Boolean>();

        for (var c : candies) {
            if (max <= c + extraCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        System.out.println(ans);

    }
}
