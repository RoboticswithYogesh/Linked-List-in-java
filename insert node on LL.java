public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);        

        /* entered position is 0, insert at head */
        if (pos == 0) {
            
            newNode.next = head;
            head = newNode;
        }
		else{
        int count = 0;
        LinkedListNode<Integer> temp = head;

        /* calculating length + traversing to end of list */
        while (count < pos-1 && temp !=null){
            count++;
            temp=temp.next;
        }
        if(temp !=null){
            
        
        newNode.next = temp.next;
        temp.next = newNode;
        }
        }
        return head;
    }
}