import java.util.ArrayList;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode curr = new ListNode();
		ListNode head = curr;
		while (l1 != null || l2 != null) {
			int a = 0;
			int b = 0;
			if (l1 != null) {
				a = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				b = l2.val;
				l2 = l2.next;
			}
			int sum = a + b + carry;
			carry = sum / 10;
			int cval = sum % 10;
			curr.next = new ListNode(cval);
			curr = curr.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return head.next;
	}
}
