import java.util.Scanner;

public class MissingNum{

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = 0;
        int actualSum = 0;

        // Find sum of elements in the array
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // Find sum of numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            actualSum += i;
        }

        // Difference is the missing number
        int missingNum = actualSum - sum;

        return missingNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);

        System.out.println("Missing number = " + result);

        sc.close();
    }
}