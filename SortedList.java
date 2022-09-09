class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class SortedList {

	static void printNode(ListNode node) {
		while (node != null) {
			System.out.print(node.val);
			System.out.print("->");
			node = node.next;
		}
		
	}

	static int myMax(ListNode list1, ListNode list2) {
		return list1.val > list2.val ? list1.val : list2.val;
	}

	static int myMin(ListNode list1, ListNode list2) {
		return list1.val < list2.val ? list1.val : list2.val;
	}

	static ListNode merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode res = new ListNode();
		ListNode head = new ListNode(0, res);

		int val1, val2;

		while (list1 != null || list2 != null) {

			if (list1 == null) {
				res.val = list2.val;
				list2 = list2.next;
			} else if (list2 == null) {
				res.val = list1.val;
				list1 = list1.next;
			} else  {
				res.val = myMin(list1, list2);
				res.next = new ListNode();
				res = res.next;
				res.val = myMax(list1, list2);
				res.next = new ListNode();
				res = res.next;
			}

			list1 = list1 == null ? null : list1.next;
			list2 = list2 == null ? null : list2.next;
		}

		return head;
	}


	public static void main(String[] args) {
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(2, a);
		ListNode c = new ListNode(1, b);

		ListNode A = new ListNode(9);
		ListNode B = new ListNode(3, A);
		ListNode C = new ListNode(1, B);
		ListNode D = new ListNode(-1, C);

		ListNode res = merge(c, D);
		printNode(res);
	}
}
