public class OddEvenLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;    
    }
    public static void main(String[] args) {
        OddEvenLL oddEvenLL = new OddEvenLL();
        ListNode head = oddEvenLL.new ListNode(1);
        head.next = oddEvenLL.new ListNode(2);
        head.next.next = oddEvenLL.new ListNode(3);
        head.next.next.next = oddEvenLL.new ListNode(4);
        head.next.next.next.next = oddEvenLL.new ListNode(5);

        ListNode result = oddEvenLL.oddEvenList(head);
        System.out.print("Reordered list: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}