package dynamicprogramming;

import java.util.Arrays;

public class FrongJump {

      // tabulation approach
      public static int findBestJumpsTabulation(int[] nums, int[] dp) {
            dp[0] = 0;
            for (int i = 1; i < nums.length; i++) {
                  int left = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
                  int right = Integer.MAX_VALUE;
                  if (i > 1)
                        right = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
                  dp[i] = Math.min(left, right);
            }
            return dp[nums.length-1];

      }

      // memorization approach
      public static int findBestJumps(int[] nums, int index, int[] dp) {
            if (index == 0)
                  return 0;
            if (dp[index] != -1)
                  return dp[index];
            int left = findBestJumps(nums, index - 1, dp) + Math.abs(nums[index] - nums[index - 1]);
            int right = Integer.MAX_VALUE;
            if (index > 1)
                  right = findBestJumps(nums, index - 2, dp) + Math.abs(nums[index] - nums[index - 2]);
            return dp[index] = Math.min(left, right);
      }

      public static void main(String[] args) {
            int nums[] = { 10, 20, 30, 10 };
            int len = nums.length;
            int dp[] = new int[len];
            Arrays.fill(dp, -1);
            System.out.println(findBestJumps(nums, len - 1, dp));
            System.out.println(findBestJumpsTabulation(nums, dp));
      }
}
