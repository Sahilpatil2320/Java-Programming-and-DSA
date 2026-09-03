import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        if( n <= 0){
            System.out.println("Array length must be greater than zero.");
            sc.close();
            return;
        }

        int [] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element is: "+smallest);
        
        sc.close();
    }
}
