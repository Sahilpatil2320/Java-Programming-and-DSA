import java.util.Scanner;

public class CountOccurrencesGivenElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        System.out.println("Count of "+target+" is: "+count);
        sc.close();
    }
}