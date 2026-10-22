public class DeleteNodeSLL{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        DeleteNodeSLL deleteNodeSLL = new DeleteNodeSLL();
        ListNode head = deleteNodeSLL.new ListNode(4);
        head.next = deleteNodeSLL.new ListNode(5);
        head.next.next = deleteNodeSLL.new ListNode(1);
        head.next.next.next = deleteNodeSLL.new ListNode(9);
        deleteNodeSLL.deleteNode(head.next); // Deletes node with value 5
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " "); // Output: 4 1 9
            current = current.next;
        }
    }
}