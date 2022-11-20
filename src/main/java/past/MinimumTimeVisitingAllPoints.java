package past;

public class MinimumTimeVisitingAllPoints {

    private static int[][] diagonals = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};

    public static void main(String[] args) {

        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
//        int[][] points = {{3, 2}, {-2, 2}};

        var sec = 0;
        int x1 = points[points.length - 1][0], y1 = points[points.length - 1][1];
        for (int i = points.length - 2; 0 <= i; i--) {
            int x2 = points[i][0], y2 = points[i][1];
            sec += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
            x1 = x2;
            y1 = y2;
        }

//        for (int i = 0, len = points.length - 1; i < len; i++) {
//
//            int[][] tmp = {{points[i][0], points[i][1]}};
//            while (true) {
//                if (tmp[0][0] == points[i + 1][0] || tmp[0][1] == points[i + 1][1]) {
//                    break;
//                }
//
//                var dx = Math.abs(tmp[0][0] + diagonals[0][0] - points[i + 1][0]);
//                var dy = Math.abs(tmp[0][1] + diagonals[0][1] - points[i + 1][1]);
//                var index = 0;
//                for (int j = 1; j < 4; j++) {
//                    var tmpDx = Math.abs(tmp[0][0] + diagonals[j][0] - points[i + 1][0]);
//                    var tmpDy = Math.abs(tmp[0][1] + diagonals[j][1] - points[i + 1][1]);
//                    if (tmpDx < dx && tmpDy < dy) {
//                        index = j;
//                        dx = tmpDx;
//                        dy = tmpDy;
//                    }
//                }
//
//                tmp[0][0] += diagonals[index][0];
//                tmp[0][1] += diagonals[index][1];
//                ans++;
//
//            }
//
//            ans += Math.abs(tmp[0][0] - points[i + 1][0]);
//            ans += Math.abs(tmp[0][1] - points[i + 1][1]);
//
//        }

        System.out.println(sec);

    }

    //            var diff_x = points[i + 1][0] - points[i][0];
//            var diff_y = points[i + 1][1] - points[i][1];
//
//            int[][] tmp = {{points[i][0], points[i][1]}};
//            if (0 < diff_x && 0 < diff_y) { // + +
//                while (true) {
//                    if (points[i + 1][0] <= tmp[0][0] || points[i + 1][1] <= tmp[0][1]) {
//                        ans += Math.abs(points[i + 1][0] - tmp[0][0]);
//                        ans += Math.abs(points[i + 1][1] - tmp[0][1]);
//                        break;
//                    }
//                    tmp[0][0]++;
//                    tmp[0][1]++;
//                    ans++;
//                }
//            } else if (diff_x < 0 && diff_y < 0) { // - -
//                while (true) {
//                    if (tmp[0][0] <= points[i + 1][0] || tmp[0][1] <= points[i + 1][1]) {
//                        ans += Math.abs(tmp[0][0] - points[i + 1][0]);
//                        ans += Math.abs(tmp[0][1] - points[i + 1][1]);
//                        break;
//                    }
//                    tmp[0][0]--;
//                    tmp[0][1]--;
//                    ans++;
//                }
//            }

}
