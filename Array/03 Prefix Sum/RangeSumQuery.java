public class RangeSumQuery {

    public static int rangeSum(int [] arr, int left, int right){
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        int left = 0;
        int right = 3;
        int result = rangeSum(arr,left,right);
        System.out.println(result);
    }
}