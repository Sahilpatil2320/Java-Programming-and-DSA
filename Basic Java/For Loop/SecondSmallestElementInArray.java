import java.util.Scanner;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("Array at least contain 2 elements.");
            sc.close();
            return ;
        }
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }

        if(secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest distinct element.");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Second smallest: " + secondSmallest);
        }



        sc.close();
    }
}