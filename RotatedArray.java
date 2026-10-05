import java.util.Arrays;

public class RotatedArray {

    // Method to rotate the array
    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // If k is greater than n
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Method to reverse part of the array
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];

            nums[start] = nums[end];

            nums[end] = temp;

            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        System.out.println("Before rotation: "
                + Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("After rotation: "
                + Arrays.toString(nums));
    }
}