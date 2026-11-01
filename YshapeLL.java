public class YshapeLL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
    public static void main(String[] args) {
        YshapeLL yshapeLL = new YshapeLL();
        ListNode headA = yshapeLL.new ListNode(4);
        headA.next = yshapeLL.new ListNode(1);
        ListNode intersection = yshapeLL.new ListNode(8);
        headA.next.next = intersection;
        intersection.next = yshapeLL.new ListNode(4);
        intersection.next.next = yshapeLL.new ListNode(5);

        ListNode headB = yshapeLL.new ListNode(5);
        headB.next = yshapeLL.new ListNode(6);
        headB.next.next = yshapeLL.new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = yshapeLL.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}