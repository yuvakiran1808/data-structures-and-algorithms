package Recursion;

public class SubsetSum {
    public static void PrintAllSum(int[] nums,int index,int sum)
    {

           if(index==nums.length)
           {
               System.out.println(sum);
               return;
           }   
           sum = sum+nums[index];
           PrintAllSum(nums,index+1,sum);
           sum = sum-nums[index];
           PrintAllSum(nums, index+1, sum);
    }
        public static void main(String[] args) {
              int nums[]  ={3,1,2};
              PrintAllSum(nums,0,0);
        }
}
