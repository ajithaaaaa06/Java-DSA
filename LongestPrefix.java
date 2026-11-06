import java.util.Scanner;

public class LongestPrefix{
     public static int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0;
        int[] arr = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            arr[ch]++;

            while (arr[ch] > 1) {
                arr[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}