import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String newWord = sc.nextLine();
        String word = newWord.toLowerCase().replaceAll(" ", "");
        String processed = ""; 
        System.out.println("Character frequencies are: ");

        for(int i = 0; i < word.length(); i++){
            if(!processed.contains(String.valueOf(word.charAt(i)))){
                int frequency = 0;
                for(int j = 0; j < word.length(); j++){
                    if(word.charAt(i) == word.charAt(j)){
                        frequency++;
                    }
                }

                System.out.println(word.charAt(i) + " : " + frequency);

                processed += word.charAt(i);
            }
        }
        sc.close();
    }
}