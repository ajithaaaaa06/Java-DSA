import java.util.*;
public class KthLargestElement{
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : nums) {
            if (pq.size() < k) {
                pq.offer(x);
            } else if (x > pq.peek()) {
                pq.poll();
                pq.offer(x);
            }
        }

        return pq.peek();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");

        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter numbers: ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter k value: ");

        int k = sc.nextInt();

        System.out.println(findKthLargest(nums, k));

        sc.close();
    }

}