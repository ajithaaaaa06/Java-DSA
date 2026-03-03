import java.util.Scanner;
public class palindrome {

    // Method to check palindrome
    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) 
            return false;

        // Numbers ending with 0 but not 0 itself are not palindrome
        if (x % 10 == 0 && x != 0)
             return false;

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        // For even digits: x == reversed
        // For odd digits: x == reversed/10
        return x == reversed || x == reversed / 10;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();  // Change number here
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
}