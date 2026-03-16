import java.util.*;
public class removeouterparanthesis {
   public static String removeOuterParentheses(String s) {
        String result = "";
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (depth > 0) {
                    result = result + c;
                }
                depth++;
            } 
            else if (c == ')') {
                depth--;
                if (depth > 0) {
                    result = result + c;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parentheses string:");
        String s = sc.nextLine();

        String result = removeOuterParentheses(s);

        System.out.println("Output: " + result);
    }
}
