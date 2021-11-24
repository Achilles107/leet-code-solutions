import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class LinkedListClass {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    // 1 2 3 4 5
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        temp = dummy;
        int idxOfNodeToBeDeleted = size - n;
        while (idxOfNodeToBeDeleted > 0){
            temp = temp.next;
            idxOfNodeToBeDeleted--;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
    // 1 2 3 4 5 null
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }

        while (head != null){
            if (head.val != stack.pop())
                return false;
            head= head.next;
        }

        return true;
    }
    public boolean hasCycle(ListNode head) {
        if (head==null)
            return true;
        if (head.next == null)
            return false;
        Set<ListNode> set = new LinkedHashSet<>();
        while (head != null){
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode temp = null;
        ListNode temp2 = null;
        if (l1.val <= l2.val){
            dummy.next = l1;
            temp = l1;
            temp2 = l2;
        } else {
            dummy.next = l2;
            temp = l2;
            temp2 = l1;
        }
        while (temp.next != null && temp2 !=null){
            if (temp.next.val >= temp2.val){
                ListNode nextNode = temp.next;
                //System.out.println("N "+temp2.val);
                ListNode newNode = new ListNode(temp2.val);
                //System.out.println(newNode.val);

                newNode.next = nextNode;
                temp.next = newNode;
                temp2 = temp2.next;

            } else {
                temp = temp.next;
            }
        }
        while (temp2 != null){
            //System.out.println(temp2.val);
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedListClass llc = new LinkedListClass();
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = head;
        ListNode head1 = new ListNode(1);
        ListNode l21 = new ListNode(7);
        head1.next = l21;

        //llc.deleteNode(l2);
        //llc.removeNthFromEnd(head, 2);
        //ListNode merged = llc.mergeTwoLists(head, head1);
        //System.out.println(llc.isPalindrome(head));
        /*while (merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }*/
        System.out.println(llc.hasCycle(head));
    }
}
