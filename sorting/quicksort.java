package sorting;

class quicksort {
    
    public static int partition(int arr[],int left,int right)
    {
        int pivot = arr[left];
        int i = left;
        int j = right;
        
        while(i<j)
        {
            while(arr[i]<=pivot&&i<=right-1)
            {
                i++;
            }
            while(arr[j]>pivot&&j>=left+1)
            {
                j--;
            }
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = pivot;
        arr[left] = arr[j];
        arr[j] = pivot;
        
        return j;
        
        
    }
    public static void quicksort1(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quicksort1(arr,low,pi-1);
            quicksort1(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
       int arr[] = {2,3,1,9,0,5};
       quicksort1(arr,0,5);
       
       for(int k=0;k<arr.length;k++)
       {
           System.out.print(arr[k]+" ");
       }
        
    }
}