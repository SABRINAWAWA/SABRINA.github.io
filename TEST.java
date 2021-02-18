
public class TEST {
	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(3, a);
		Node c = new Node(2, b);
		Node firstNode = c;
		Node currentNode = firstNode;


		while(currentNode.next != null) {
		   System.out.print(currentNode.data);
		   currentNode = currentNode.next;
		}


	}
}
