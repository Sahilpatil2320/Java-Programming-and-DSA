import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int [] twoSum(int [] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            int required = target - arr[i];
            if(map.containsKey(required)){
                return new int [] {map.get(required), i};
            }
            map.put(arr[i], i);
            
        }
        return new int []  {-1,-1};
    }

    public static void main(String[] args) {
        int [] arr = {2,4,7,9,11};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}