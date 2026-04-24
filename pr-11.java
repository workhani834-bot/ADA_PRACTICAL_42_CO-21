public class MatrixChainMultiplication {

    static int matrixChainOrder(int[] p, int n) {

        int[][] dp = new int[n][n];

        for (int len = 2; len < n; len++) {

            for (int i = 1; i < n - len + 1; i++) {

                int j = i + len - 1;

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int q = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j];

                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }
            }
        }

        return dp[1][n - 1];
    }

    public static void main(String[] args) {

        int[] p = {10, 20, 30, 40, 30};

        int n = p.length;

        System.out.println("Minimum number of multiplications = " + matrixChainOrder(p, n));
    }
}
