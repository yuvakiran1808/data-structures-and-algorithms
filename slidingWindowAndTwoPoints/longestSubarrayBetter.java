package slidingWindowAndTwoPoints;

public class longestSubarrayBetter {
    public static void main(String[] args)
    {
          int arr[] = {2,5,1,10,10};
          int right = 0;
          int left = 0;
          int sum = 0;
          int target = 14;
          int maxLen = 0;
          while(right<arr.length)
          {
                sum = sum+arr[right];
               System.out.println("This is sum"+sum);
                if(sum>target)
                {
                    sum = sum-arr[left];
                    left++;
                }
                if(sum<=target)
                maxLen = Math.max(maxLen,right-left+1); 
            right++;
          }
         System.err.println(maxLen);
    }
}
