package in.LL;


public class MainApp {
	
	public static void main(String[] args) {
		
//		SingleLinkedList ll = new SingleLinkedList();
//		ll.insertFirst(4);
//		ll.insertFirst(3);
//		ll.insertFirst(2);
//		ll.insertFirst(1);
//
//		ll.insert(7, 2);
//		
//		ll.display();	
//		System.out.println();
//		System.out.println("The Deleted Element is:: " + ll.deleteLast());
//		ll.display();
//		System.out.println();
//		System.out.println("The Deleted Element is:: " + ll.delete(2));
//		ll.display();
		
		
//		DoublyLinkedList dLL = new DoublyLinkedList();
//		dLL.insertFirst(4);
//		dLL.insertFirst(3);
//		dLL.insertFirst(2);
//		dLL.insertFirst(1);
//		dLL.insertLast(5);
//		
//		dLL.insert(5, 6);
//		
//		dLL.display();
		
		
		CircularLL cLL = new CircularLL();
		cLL.insert(8);
		cLL.insert(5);
		cLL.insert(3);
		cLL.insert(2);
		
		
		cLL.deleteNode(8);
		cLL.deleteNode(5);
		cLL.deleteNode(3);
//		cLL.deleteNode(2);
		
		cLL.display();
					
	}
	
}
