import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        

        int n = number;
        int count = 0;
        
        if(n == 0){
            count++;
        }else {
            while(n > 0){
                count++;
                n /= 10;
            }
        }

        n = number;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += (int)Math.pow(digit, count);
            n /= 10;
        }

        if(sum == number){
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}