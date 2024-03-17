package past;
// import java.util.Arrays;
// import java.util.stream.Stream;
// import static java.lang.Math.min;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// import static java.lang.Math.abs;

// public class CPClasses {
//     public static void main(String[] args) {

//         int N, Q;
//         int[] A;
//         try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
//             N = Integer.parseInt(bf.readLine());
//             A = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//             Q = Integer.parseInt(bf.readLine());
//             Arrays.sort(A);
//             for (int i = 0; i < Q; i++) {
//                 int b = Integer.parseInt(bf.readLine());
//                 int index = Arrays.binarySearch(A, b);
//                 if (index < 0) {
//                     index = -(index + 1); // 挿入位置
//                 } else {
//                     System.out.println("0");
//                     continue;
//                 }

//                 int ans = Integer.MAX_VALUE;
//                 if (index < N) {
//                     ans = min(ans, abs(b - A[index]));
//                 }
//                 if (index > 0) {
//                     ans = min(ans, abs(b - A[index - 1]));
//                 }
//                 System.out.println(ans);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//             return;
//         }

//     }

// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CPClasses {
    public static void main(String[] args) {

        int N, Q;
        TreeSet<Integer> A;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(bf.readLine());
            A = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                    .collect(Collectors.toCollection(TreeSet::new));
            Q = Integer.parseInt(bf.readLine());
            for (int i = 0; i < Q; i++) {
                int b = Integer.parseInt(bf.readLine());
                Integer floor = A.floor(b);
                floor = floor == null ? Integer.MAX_VALUE : floor;
                Integer ceiling = A.ceiling(b);
                ceiling = ceiling == null ? Integer.MAX_VALUE : ceiling;
                System.out.println(Math.min(Math.abs(b - floor), Math.abs(b - ceiling)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

}
