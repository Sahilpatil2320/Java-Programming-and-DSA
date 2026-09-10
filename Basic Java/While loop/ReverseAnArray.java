import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int right = 0;
        int left = n - 1;
        System.out.print("Reverse array is: ");

        while( right <= left){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            right++;
            left--;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
