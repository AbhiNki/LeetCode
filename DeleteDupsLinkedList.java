package level_easy;

import java.util.HashSet;

public class DeleteDupsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current=head;
        ListNode prev=current;
        
        HashSet<Integer> set = new HashSet<Integer>();
        while(current!=null)
        {
            if(set.contains(current.val))
            {
                prev.next=current.next;
            }
            else
            {
                set.add(current.val);
                prev=current;
            }
            
            current=current.next;
        }
        return head;
    }
    
    public ListNode delteDuplicates2(ListNode head)
    {
    	ListNode current=head;
    	
    	while(current!=null)
    	{
    		ListNode runner=current;
    		while(runner.next!=null)
    		{
    			if(runner.next.val==current.val)
    				runner.next=runner.next.next;
    			else
        			runner=runner.next;
    		}
    		current=current.next;
    	}
    	return head;
    }
    

}
