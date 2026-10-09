import java.util.Arrays;
import java.util.Scanner;
public class Alternate_pov_neg {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                newArr[pos] = nums[i];
                pos += 2;
            } else {
                newArr[neg] = nums[i];
                neg += 2;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements (equal positive and negative numbers):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(nums);

        System.out.println("Rearranged array: " + Arrays.toString(result));

        sc.close();
    }
}
