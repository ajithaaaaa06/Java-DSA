import java.util.Scanner;
class binarySearch {
    public static int search(int[] nums, int target) {
        int start =0,end =nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter key to search: ");
        int target = sc.nextInt();
        int result = search(nums, target);

        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }

        sc.close();
    }
}
