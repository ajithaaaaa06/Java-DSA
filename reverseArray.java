import java.util.Scanner;

class reverseArray {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] s = str.toCharArray();

        reverseString(s);

        System.out.print("Reversed string: ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}