
public class quicksort {

    public static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] >= pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void qsort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 9, 1 };
        int len = arr.length;
        qsort(arr, 0, len - 1);

        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
}