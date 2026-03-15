import java.util.*;

class ReverseWords {

    public String reverseWords(String s) {
        s = s.trim(); // remove leading and trailing spaces
        String[] words = s.split("\\s+"); // split by one or more spaces
        
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        ReverseWords obj = new ReverseWords();
        String output = obj.reverseWords(s);

        System.out.println("Reversed words: " + output);
    }
}