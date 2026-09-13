import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + (n - 1) + " array elements:");

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - sum;

        System.out.println("Missing number = " + missingNumber);

        sc.close();
    }
}