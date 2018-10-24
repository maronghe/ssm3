package com.logan.test;

public class TestNode {
	public static void main(String[] args) {
//		int[] arr = new int[] {1,2,3};
//		System.out.println(arr[-1]);
		ListNode head = initNode(0);
		print(head);
		System.out.println("==========");
		ListNode reverse = reverse(head);
		print(reverse);
	}

	/**
	 * 初始化数组大小为5
	 *  n>0
	 * @return
	 */
	private static ListNode initNode(int n) {
		if(n <= 0) {
			throw new IndexOutOfBoundsException("Can not be : " + n);
		}
		ListNode head = new ListNode(1);
		ListNode cur = head;
		for(int i = 2 ; i < n ; i ++) {
			cur.next = new ListNode(i);
			cur = cur.next;
		}
		return head;
	}

	private static void print(ListNode head) {
		ListNode t = head;
		while(t != null) {
			System.out.println(t.val);
			t = t.next;
		}
	}

	/**
	 *  链表翻转 
	 *  时间复杂度O(n)
	 *  空间复杂度O(n)
	 * @param head
	 * @return ListNode 
	 */
	public static ListNode reverse(ListNode head) {
		if(head == null) {
			return null;
		}
		
		if(head.next == null) {
			return head;
		}
		
		ListNode cur = head;
		ListNode prev = null;
		while(cur != null) {
			ListNode next = cur.next; // 取出下一个
			if(next == null) {
				head = cur; // 最后一个，返还给head
			}
			cur.next = prev; // 翻转
			prev = cur; // cur值给prev
			cur = next; // cur向后移动一位
		}
		
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
