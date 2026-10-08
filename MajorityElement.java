import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // If count becomes 0, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // Voting
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 1, 1, 1, 2, 1};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}