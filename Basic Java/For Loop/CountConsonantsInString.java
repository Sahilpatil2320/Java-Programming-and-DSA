import java.util.Scanner;

public class CountConsonantsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine().toLowerCase();
        int count = 0;

        for(int i = 0; i < name.length(); i++){
            if(Character.isLetter(name.charAt(i))){
                if(name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u' ){
                    count++;
                }
            }
        }
        System.out.println("Number of Consonants: "+count);
        sc.close();
    }
}
