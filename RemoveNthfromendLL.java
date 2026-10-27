public class RemoveNthfromendLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head = head.next;
            return head;
        }
        int i = 1;
        int itoFind = size -n;
        ListNode prev = head;
        while(i<itoFind){
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head; 
    }
    public static void main(String[] args){
        RemoveNthfromendLL obj = new RemoveNthfromendLL();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);
        int n = 2;
        ListNode result = obj.removeNthFromEnd(head, n);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
