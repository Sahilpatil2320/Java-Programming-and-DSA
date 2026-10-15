public class CountWords {

    public static int countWords(String str) {
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is easy to learn";
        System.out.println(countWords(str));
    }
}