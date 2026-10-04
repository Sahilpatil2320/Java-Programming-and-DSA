public class MinimumSumSubarrayOfSizeK {

    public static int minSum(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int minSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 2;

        System.out.println(minSum(arr, k));
    }
}