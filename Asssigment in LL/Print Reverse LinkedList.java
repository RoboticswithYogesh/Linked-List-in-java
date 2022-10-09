public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		   LinkedListNode<Integer> smallOutput=printReverseRecursion(root);
	}
    
    public static LinkedListNode<Integer> printReverseRecursion(LinkedListNode<Integer> node)
    {
        if (node==null)
            return node;
        LinkedListNode<Integer> smallOutput=printReverseRecursion(node.next);
        System.out.print(node.data+" ");
        return smallOutput;
	}

}