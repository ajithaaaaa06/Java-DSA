public class ReverseLL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public static void main(String[] args) {
        ReverseLL obj = new ReverseLL();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        ListNode reversedHead = obj.reverseList(head);

        while (reversedHead != null) {
            System.out.print(reversedHead.val);
            if (reversedHead.next != null) {
                System.out.print(" -> ");
            }
            reversedHead = reversedHead.next;
        }
    }
}