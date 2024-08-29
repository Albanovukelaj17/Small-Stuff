import java.util.Scanner;

public class Solution {
    public ListNode reverseList(ListNode head) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a random amount of numbers, with a whitespace between them, limit is 100 numbers");

        String[] input = scanner.nextLine().split(" ");
        int len = Math.min(input.length, 100);

        if (len == 0) {
            System.out.println("Write at least one number");
            return;
        }

        ListNode head = new ListNode(Integer.parseInt(input[0]));
        ListNode current = head;
        for (int i = 1; i < len; i++) {
            current.next = new ListNode(Integer.parseInt(input[i]));
            current = current.next;
        }

        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed list is:");
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}
