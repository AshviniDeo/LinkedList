package bridgeLabz.linkedList;

class Node{
	int data;
	Node nextPointer;
	@Override
	public String toString() {
		return "Node [data=" + data + ", nextPointer=" + nextPointer + "]";
	}
	public Node(int data) {
		this.data = data;
		this.nextPointer = null;
	}
}

public class LinkedList {

	static Node head;

	public void addNode(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.nextPointer != null) {
				temp = temp.nextPointer;
			}
			temp.nextPointer = node;
		}

	}

	public void displayNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.nextPointer;
		}

	}

	public void removeNode(int data) {
		Node temp = head;
		Node prev = head;
		if(temp.data == (data)) {
			head = temp.nextPointer;
		}
		
	}

}
