import java.util.Scanner;

public class LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number < smallest){
                smallest = number;
            } 
            if(number > largest){
                largest = number;
            }
        }
        System.out.println("Smallest element is: "+smallest);
        System.out.println("Largest element is: "+largest);
        sc.close();
    }
}
