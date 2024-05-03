import java.util.Stack;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class ReverseLL {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;

        Stack<Integer> s = new Stack<>();
        while (temp != null) {
            s.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            temp.val = s.pop();
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);

        head = reverseList(head);
        printLL(head);
    }
}