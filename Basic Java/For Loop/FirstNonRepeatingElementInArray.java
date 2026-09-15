import java.util.Scanner;

public class FirstNonRepeatingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean repeating = false;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeating = true;
                    break;
                }
            }

            if (!repeating) {
                System.out.println("First non-repeating element = " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating element");
        }

        sc.close();
    }
}