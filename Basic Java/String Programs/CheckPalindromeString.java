import java.util.Scanner;

public class CheckPalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        int n = word.length() - 1;
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(n)){
                System.out.println("Not palindrome");
                sc.close();
                return;
            }
            n--;
        }
        System.out.println("palindrome");
        sc.close();
    }
}