import java.util.Scanner;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number % 2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
    
        System.out.println("Even count is "+evenCount+" & Odd count is "+oddCount);
        sc.close();
    }
}
