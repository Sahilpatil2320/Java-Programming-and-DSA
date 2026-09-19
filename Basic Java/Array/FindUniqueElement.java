import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = 0;

        for (int num : arr) {
            unique = unique ^ num;
        }

        System.out.println("Unique element = " + unique);

        sc.close();
    }
}