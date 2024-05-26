package slidingWindowAndTwoPoints;

public class constantWindow {

    public static int getMaxSum(int arr[], int Ws) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int left = 0;
        int right = Ws - 1;
        for (int i = 0; i < Ws; i++) {
            sum = sum + arr[i];
        }

        while (right < arr.length - 1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            maxi = Math.max(maxi, sum);
        }

        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 3, 4, 5, -1 };
        int windowSize = 4;
        System.out.println(getMaxSum(arr, windowSize));
    }
}
