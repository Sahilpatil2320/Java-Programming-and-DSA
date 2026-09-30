public class MaximumSumSubarray {

    public static int maxSum(int[] arr) {

        int sum = 0;
        int maxSum = arr[0];

        for (int num : arr) {

            sum += num;

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSum(arr));
    }
}