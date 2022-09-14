class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 3, 5, 1, 6, 4};
        int maxPrifile = maxProfit(prices);
        System.out.println(maxPrifile);
    }

    public static int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int maxProfile = 0;

        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                int profile = prices[j] - prices[i];
                maxProfile = Math.max(maxProfile, profile);
                j++;
            } else {
                i++;
                j++;
            }
        }
        return maxProfile;
    }
}