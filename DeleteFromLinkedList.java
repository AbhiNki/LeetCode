package level_easy;

public class DeleteFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)head=head.next;
        ListNode current=head;
        while(current !=null && current.next!=null)
        {
            if(current.next.val==val)
                current.next=current.next.next;
            else
                current=current.next;
        }
        return head;
        
    }
	public ListNode removeElements1(ListNode head, int val) {
		if(head==null) return null;
		head.next=removeElements1(head.next, val);
		return head.val==val?head.next:head;
	}
	

}
