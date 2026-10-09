import java.util.HashSet;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return num;
            } 
            set.add(num);
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int [] arr = {2,5,7,3,2,4,3};

        System.out.println(firstRepeatingElement(arr));
    }
}
