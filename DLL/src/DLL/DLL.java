package DLL;

public class DLL {
	public Node head;
	public Node tail;
	private int size;
	
	public DLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void push(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
			return;
		}
		
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
		this.size++;
	}
	
	public void printValuesForward() {
		Node runner = this.head;
		
		System.out.println("This is the front of the list");
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		System.out.println("This is the back of the list");
	}
	
	public void printValuesBackward() {
		Node runner = this.tail;
		
		System.out.println("This is the back of the list");
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.previous;
		}
		System.out.println("This is the front of the list");
	}
	
	public Node pop() {
		Node end = this.tail;
		if(end.previous == null) {
			this.head = null;
			this.tail = null;
			this.size--;
			return end;
		}
		Node newEnd = end.previous;
		newEnd.next = null;
		this.tail = newEnd;
		this.size--;
		return end;
	}
	
	public boolean contains(Integer value) {
		if(this.head == null) {
			return false;
		}
		Node runner = this.head;
		while(runner != null) {
			if(runner.value == value) {
				return true;
			}
			runner = runner.next;
		}
		return false;	
	}
	
	public int size() {
		return this.size;
	}
	
	public void insertAt(Node newNode, int index) {
		if(index > this.size) {
			System.out.println("This index does not exist inside the list");
			return;
		}
		if(index == this.size) {
			Node end = this.tail;
			end.next = newNode;
			this.tail = newNode;
			newNode.previous = end;
			this.size++;
			return;
		}
		if(index == 0) {
			Node start = this.head;
			this.head = newNode;
			newNode.next = start;
			start.previous = newNode;
			this.size++;
			return;
		}
		Node runner = this.head;
		int i = 0;
		while(i<index) {
			runner = runner.next;
			i++;
		}
		Node previous = runner.previous;
		previous.next = newNode;
		newNode.previous = previous;
		newNode.next = runner;
		runner.previous = newNode;
		this.size++;
	}
	
	public void removeAt(int index) {
		if(index >= this.size) {
			System.out.println("This index does not exist inside the list");
			return;
		}
		if(index == 0) {
			Node newStart = this.head.next;
			this.head = newStart;
			newStart.previous = null;
			this.size--;
			return;
		}
		if(index == this.size-1) {
			Node newEnd = this.tail.previous;
			this.tail = newEnd;
			newEnd.next = null;
			this.size--;
			return;
		}
		Node runner = this.head;
		int i = 0;
		while(i<index) {
			runner = runner.next;
			i++;
		}
		Node prev = runner.previous;
		Node nex = runner.next;
		prev.next = nex;
		nex.previous = prev;
		this.size--;
	}
	
	public boolean isPalindrome() {
		if(this.size == 0 || this.size == 1) {
			return true;
		}
		Node back = this.tail;
		Node front = this.head;
		while(front.next != null) {
			if(back.value != front.value) {
				return false;
			}
			front = front.next;
			back = back.previous;
		}
		return true;
	}
}
