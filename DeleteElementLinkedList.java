package level_easy;

public class DeleteElementLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void specificNodeDelete(ListNode node)
	{
		node.val=node.next.val;
		node.next=node.next.next;
	}
	
	public static void specificNodeDelete2(ListNode node)
	{
		ListNode current=node;
		ListNode prev=null;
		while(current!=null)
		{
			current.val=current.next.val;
			prev=current;
			current=current.next;
		}
		prev.next=null;
	}
}
