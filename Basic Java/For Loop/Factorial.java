import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;

        }
        long fact = 1;

        for( int i = 1; i <=n; i++){
            fact *= i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
        sc.close();
    }
}