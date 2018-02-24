package level_easy;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode reverLinkedList(ListNode head)
	{
		if(head==null)return null;
		ListNode prevHead=null;
		while(head!=null)
		{
			ListNode nextNode=head.next;
			head.next=prevHead;
			prevHead=head;
			head=nextNode;
		}
		return prevHead;
	}
	
	public static ListNode reverseLinkedListRecursive(ListNode head)
	{
		return revListRecImpl(head,null);
	}
	public static ListNode revListRecImpl(ListNode head, ListNode prevHead)
	{
		if(head==null)return prevHead;
		ListNode next=head.next;
		head.next=prevHead;
		return revListRecImpl(next, head);
	}

}
