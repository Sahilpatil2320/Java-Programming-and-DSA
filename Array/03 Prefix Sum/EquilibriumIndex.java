class EquilibriumIndex{

    public static int findEquilibriumIndex(int [] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {1, 2, 5, 3, 4, 4};
        int result = findEquilibriumIndex(arr);
        System.out.println(result);
    }
}