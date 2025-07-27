package dynamicprogramming;

import java.util.Arrays;

public class FrogJumpk {
    // memoization
    public static int frogkJumps(int index, int[] height, int[] dp, int k) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int AllSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (index - j >= 0) {
                int jumps = frogkJumps(index - j, height, dp, k) + Math.abs(height[index] - height[index - j]);
                ;
                AllSteps = Math.min(AllSteps, jumps);
            }
        }

        return dp[index] = AllSteps;
    }

    // tabulation
    public static int frogkJumpsTabulation(int n, int[] height, int[] dp, int k) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int AllSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jumps = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    AllSteps = Math.min(AllSteps, jumps);
                }
            }
            dp[i] = AllSteps;

        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] height = { 10, 20, 30, 10 };
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int k = 3;
        System.out.println(frogkJumps(n - 1, height, dp, k));
        System.out.println(frogkJumpsTabulation(n, height, dp, k));
    }
}
