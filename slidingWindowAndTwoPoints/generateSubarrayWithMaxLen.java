package slidingWindowAndTwoPoints;

public class generateSubarrayWithMaxLen {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int maxLen = 0;
        int sum;
        int target = 15;
        for(int i=0;i<arr.length;i++)
        {
             sum = 0;
             for(int j=i;j<arr.length;j++)
             {
                sum = sum+arr[j];
                if(sum<=target)
                {
                    maxLen = Math.max(maxLen,j-i+1);
                }
                else if(sum>target)
                break;
             }  
        }
        System.out.println(maxLen);

    }
}
