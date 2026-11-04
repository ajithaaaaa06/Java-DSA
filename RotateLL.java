public class RotateLL{
    public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
    }
     public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode tail = head;

        // Find length
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        // Make circular list
        tail.next = head;

        // Find new tail
        int steps = length - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Update head and break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        head = rotateRight(head, k);

        System.out.print("Rotated List: ");
        printList(head);
    }
}