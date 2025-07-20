import java.util.ArrayList;
import java.util.List;

public class mergesort {

    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
                for (int i = low; i <= high; i++) {
            arr[i] = list.get(i-low);
        }

    }

    public static void mergeSortRecursion(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSortRecursion(arr, low, mid);
        mergeSortRecursion(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,5,2,4,1,9};
        int n = arr.length;
         mergeSortRecursion(arr, 0, n - 1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
