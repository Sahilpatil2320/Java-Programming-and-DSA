public class SubarrayWithGivenSum {

    public static boolean hasSubarrayWithSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        System.out.println(hasSubarrayWithSum(arr, target));
    }
}