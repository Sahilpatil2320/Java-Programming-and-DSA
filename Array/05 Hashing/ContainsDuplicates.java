import java.util.HashSet;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,2,3};

        System.out.println(containsDuplicates(nums));
    }
}
