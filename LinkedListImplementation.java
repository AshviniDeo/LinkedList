package bridgeLabz.linkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		 Node node1 = new Node(56);
		  Node node2 = new Node(30);
		  Node node3 = new Node(70);
		  Node temp = node1;
		 
		   node1.nextPointer = node2;
		   node2.nextPointer = node3;
		System.out.println(temp.toString());

	}

}
