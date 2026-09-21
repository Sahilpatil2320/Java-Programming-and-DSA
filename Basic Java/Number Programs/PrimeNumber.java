import java.util.Scanner;

public class PrimeNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if( n <= 1){
            System.out.println( n +" is not a Prime number");
            sc.close();
            return;
        }

        for(int i = 2; i <= n / i; i++){
            if(n % i == 0){
                System.out.println( n +" is not a Prime number");
                sc.close();
                return;
            }
        }

        System.out.println( n +" is a Prime number.");
        sc.close();
    }
}