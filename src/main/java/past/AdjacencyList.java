package past;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdjacencyList {

    private static int N;

    private static int M;

    private static int[][] AB;

    public static void main(String[] args) {

        try (final var sc = new Scanner(System.in)) {

            N = sc.nextInt();
            M = sc.nextInt();

            sc.nextLine();

            AB = new int[M + 1][];

            for (int i = 1; i < M + 1; i++) {
                AB[i] = new int[2];
                AB[i][0] = sc.nextInt();
                AB[i][1] = sc.nextInt();
                sc.nextLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        var roads = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N + 1; i++) {
            roads.add(new ArrayList<>());
        }
        for (int i = 1; i < M + 1; i++) {
            roads.get(AB[i][0]).add(AB[i][1]);
            roads.get(AB[i][1]).add(AB[i][0]);
        }

        boolean firstFlg = true;
        for (var road : roads) {
            if (firstFlg) {
                firstFlg = false;
                continue;
            }

            if (road.isEmpty()) {
                System.out.println("0");
                continue;
            }

            System.out.print(road.size() + " ");
            String r = road.stream().map(Objects::toString).sorted()
                .collect(Collectors.joining(" "));
            System.out.print(r);
            System.out.println();
        }

    }

}
