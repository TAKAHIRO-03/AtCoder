package past;

public class GasStation {

    public static void main(String[] args) {

        var gas = new int[]{1, 2, 3, 4, 5};
        var cost = new int[]{3, 4, 5, 1, 2};

        int tank = 0, start = 0, cur = 0;
        for (int i = 0, len = gas.length; i < len; i++) {
            cur += (gas[i] - cost[i]);
            tank += (gas[i] - cost[i]);
            if (cur < 0) {
                cur = 0;
                start = i + 1;
            }
        }

        System.out.println(tank < 0 ? -1 : start);

    }

}
