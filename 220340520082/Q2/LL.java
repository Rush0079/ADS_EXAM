class LL{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next = null;
		}
	}
	Node rev(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!= null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		node = prev;
		return node;
	}
	void pList(Node node){
		while(node!=null){
			System.out.println(node.data+"  ");
			node = node.next;
		}
	}
	public static void main(String[] args){
		LL l1 = new LL();
		l1.head = new Node(1);
		l1.head.next = new Node(5);
		l1.head.next.next = new Node(1);
		l1.head.next.next.next = new Node(2);
		l1.head.next.next.next.next = new Node(3);
		l1.head.next.next.next.next.next = new Node(4);
		l1.head.next.next.next.next.next.next = new Node(5);
		
		System.out.println("Given linkellist");
		l1.pList(head);
		head = l1.rev(head);
		System.out.println("Reverse of linked list is (Test case 1): ");
		l1.pList(head);
		
		
		l1.head = new Node(3);
		l1.head.next = new Node(4);
		l1.head.next.next = new Node(2);
		l1.head.next.next.next = new Node(5);
		head = l1.rev(head);
		System.out.println("Reverse of linked list is (Test case 2): ");
		l1.pList(head);
	}
}