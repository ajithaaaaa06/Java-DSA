
class PalindromeLL {
    public boolean isPalindrome(ListNode head) {

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        PalindromeLL obj = new PalindromeLL();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);

        boolean isPalindrome = obj.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
