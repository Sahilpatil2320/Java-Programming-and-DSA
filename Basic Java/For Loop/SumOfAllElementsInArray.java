import java.util.Scanner;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Sum of elements is: "+sum);
        sc.close();
    }
}
