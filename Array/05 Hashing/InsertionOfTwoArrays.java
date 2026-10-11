import java.util.HashSet;

public class InsertionOfTwoArrays{

    public static void insertion(int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();
        for(int num1 : arr2){
            if(set.contains(num1)){
                result.add(num1);
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,3,6};
        
        insertion(arr1,arr2);
    }
}