import java.util.Arrays;

public class MakeChangeDP {

    static void makeChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        int[] coinUsed = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                    coinUsed[i] = coin;
                }
            }
        }

        if (dp[amount] > amount) {
            System.out.println("No solution possible");
            return;
        }

        System.out.println("Minimum coins needed: " + dp[amount]);

        System.out.print("Coins used: ");
        int temp = amount;

        while (temp > 0) {
            System.out.print(coinUsed[temp] + " ");
            temp = temp - coinUsed[temp];
        }
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        makeChange(coins, amount);
    }
}
