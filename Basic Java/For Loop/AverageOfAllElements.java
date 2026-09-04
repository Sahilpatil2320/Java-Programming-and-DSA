import java.util.Scanner;

public class AverageOfAllElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i< n; i++){
            int number = sc.nextInt();
            sum += number;
        }
        float average =(float) sum / n;
        System.out.println("Average of all elements is: "+average);
        sc.close();
    }
}