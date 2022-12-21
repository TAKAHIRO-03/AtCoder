package past;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        var prices = new int[]{7, 1, 5, 3, 6, 4};

        var price = prices[0];
        var profit = 0;
        for (int i = 1, len = prices.length; i < len; i++) {
            if (prices[i] < price) {
                price = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - price);
        }

        System.out.println(profit);
    }
}
