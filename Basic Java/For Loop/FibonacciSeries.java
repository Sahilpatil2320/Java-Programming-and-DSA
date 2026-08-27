import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the first term: ");
        int first = sc.nextInt();
        System.out.print("Enter the second term: ");
        int second = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print(first+" ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        sc.close();
    }
}