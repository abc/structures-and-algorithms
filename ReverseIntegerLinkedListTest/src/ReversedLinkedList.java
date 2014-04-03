public class ReversedLinkedList extends SortedLinkedList implements ReversedADT{
	public ReversedADT reverse()
    {
        ListNode p;
        ListNode q;

        ReversedLinkedList reversedObjects=new ReversedLinkedList();

        if (this.head!=null)
        {
            this.head = RecursiveReverse(null, head);
        }
        return reversedObjects;
	}

    private ListNode RecursiveReverse(ListNode prev, ListNode curr)
    {
        ListNode next = curr.next;
        curr.next = prev;

        if (next == null)
        {
            return curr;
        }
        else
        {
            return RecursiveReverse(curr, next);
        }

       // return (next == null) ? curr : RecursiveReverse(curr, next);
    }
	
	private ReversedLinkedList copy(){
		ListNode currentNode;
		ListNode reversedNode;
		ReversedLinkedList reversedObjects=new ReversedLinkedList();
		if (this.head!=null){
			reversedObjects.head=new ListNode();
			reversedObjects.head.object=this.head.object;
			currentNode=this.head.next;
			reversedNode=reversedObjects.head;
			while (currentNode!=null){
				reversedNode.next=new ListNode();
				reversedNode=reversedNode.next;
				reversedNode.object=currentNode.object;
				currentNode=currentNode.next;
			}
		}
		return reversedObjects;
	}
}