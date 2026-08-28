import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        if(word.isEmpty()){
            System.out.println("Empty string !!");
            sc.close();
            return;
        }
        String reverseWord  = "";
        
        for(int i = word.length() - 1; i >= 0; i--){
            // System.out.print(word.charAt(i));
            reverseWord += word.charAt(i);
        }
        System.out.println("Reverse word of "+word+" is " +reverseWord);
        sc.close();
    }
}