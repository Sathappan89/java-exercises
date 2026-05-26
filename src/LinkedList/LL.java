package LinkedList;
public class LL {

	private Node head;
	private Node tail;
	private int size;

	/* Display function */
		public LL() {
			this.size = 0;
		}

	/* Insert first element */
		public void insertFirst(int val) {
			Node node = new Node(val);
			node.next = head;
			head = node;
	
			if (tail == null) {
				tail = head;
			}
			size = size + 1;
		}

	/* Insert at the last index */
		public void insertLast(int val) {
			if (tail == null) {
				insertFirst(val);
				return;
			}
			Node node = new Node(val);
			tail.next = node;
			tail = node;
			size++;
		}

	/* Insert value in the particular index */
		public void insert(int val, int index) {
			if (index == 0) {
				insertFirst(val);
				return;
			}
			if (index == size) {
				insertLast(val);
				return;
			}
			
			Node temp = head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			
			Node node = new Node(val, temp.next);
			temp.next=node;
			size++;
		}
		
	/* Display the linked list */
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value + "-->");
				temp = temp.next;
			}
			System.out.print("End");
			System.out.println(" ");
		}
		
	/*Delete first*/
		public int deleteFirst() {
			int val = head.value;
			head = head.next;
				if(head == null) {
					tail=null;
				}
			
				size--;
			return val;
		}
		
	/*Delete the last*/
		public int deleteLast() {
			if(size<=1) {
				return deleteFirst();
			}
			
			Node secondLast = get(size-2);
			int val = tail.value;
			tail = secondLast;
			tail.next=null;
			return val;
		}
		
		public Node get(int index) {
			Node node = head;
			for(int i=0;i<index;i++) {
				node = node.next;
			}
			return node;
		}
		
	/*Delete a particular index*/
		public int delete (int index) {
			if(index ==0 ) {
				return deleteFirst();
			}
			if(index == size-1 ) {
				return deleteLast();
			}
			
			Node prev = get(index -1);
			int val = prev.next.value;
			prev.next = prev.next.next;
			
			return val;
		}
		
		
	/*Find Node in the linked list*/
		
		public Node find(int value) {
			Node node = head;
			while(node!=null) {
				if(node.value==value) {
					return node;
				}
				node=node.next;
			}
			return node;
		}
		
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

}
