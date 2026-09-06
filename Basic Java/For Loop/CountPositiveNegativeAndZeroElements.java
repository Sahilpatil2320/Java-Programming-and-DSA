import java.util.Scanner;

public class CountPositiveNegativeAndZeroElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int zeroCount = 0 , positiveCount = 0, negativeCount = 0;
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number < 0){
                negativeCount++;
            } else if(number > 0){
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive count is: "+positiveCount);
        System.out.println("Zero count is: "+zeroCount);
        System.out.println("Negative count is: "+negativeCount);

        sc.close();
    }
}
