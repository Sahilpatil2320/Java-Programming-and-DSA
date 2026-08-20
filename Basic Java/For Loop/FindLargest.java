import java.util.Scanner;

public class FindLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Array length must be greater than 0.");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int highest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
        }
        System.out.println("Highest element is : "+highest);
        sc.close();
    }
}