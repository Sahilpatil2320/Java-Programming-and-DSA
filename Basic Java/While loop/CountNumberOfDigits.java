import java.util.Scanner;

public class CountNumberOfDigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int n = number;
        int count = 0;
        if(n == 0){
            count++;
            System.out.println("The number of digits in "+number+" is "+count);
            sc.close();
            return;
        }
        while(n > 0){
            count++;
            n/= 10; 
        }
        System.out.println("The number of digits in "+number+" is "+count);
        sc.close();
    }
}