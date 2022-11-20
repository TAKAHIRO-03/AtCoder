package past;

import java.util.LinkedList;
import java.util.Scanner;

public class DecompressRunLengthEncodedList {

    private static int N;

    private static int[] nums;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {

            N = sc.nextInt();
            sc.nextLine();

            nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            sc.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var ans = new LinkedList<Integer>();
        for (int i = 0; i < N; i = i + 2) {
            var freq = nums[i];
            var val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                ans.add(val);
            }
        }

        System.out.println(ans);

        ans.stream().mapToInt(x -> x).toArray();

    }
}
