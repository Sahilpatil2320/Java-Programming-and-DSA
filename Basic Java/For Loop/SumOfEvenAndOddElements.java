import java.util.Scanner;

public class SumOfEvenAndOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even elements = "+evenSum);
        System.out.println("Sum of odd elements = "+oddSum);

        sc.close();
    }
}
