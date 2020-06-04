package DLL;

public class DLLTest {

	public static void main(String[] args) {
		DLL dll = new DLL();
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(50);
		Node n4 = new Node(50);
		Node n5 = new Node(20);
		Node n6 = new Node(10);
		
		dll.push(n1);
		dll.push(n2);
		dll.push(n3);
		dll.push(n4);
		dll.push(n5);
		dll.push(n6);
		
		dll.printValuesForward();
		
//		dll.pop();
		Node newNode = new Node(45);
		dll.insertAt(newNode, 2);
//		dll.removeAt(4);

		
		dll.printValuesForward();
		
//		System.out.println(dll.size());
		System.out.println(dll.isPalindrome());
	}

}
