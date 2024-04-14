
public class insertionsort {

    static int small = 0;
    static int index = 0;

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            small = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < small) {
                    small = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = small;
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 53, 749, 44, 39, 82 };

        selectionSort(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
