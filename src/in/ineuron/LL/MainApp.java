package in.ineuron.LL;


public class MainApp {
	
	public static void main(String[] args) {
		
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.insertFirst(4);
		ll.insertFirst(3);
		ll.insertFirst(2);
		ll.insertFirst(1);

		ll.insert(7, 2);
		
		ll.display();	
		System.out.println();
		System.out.println("The Deleted Element is:: " + ll.deleteLast());
		ll.display();
		System.out.println();
		System.out.println("The Deleted Element is:: " + ll.delete(2));
		ll.display();
					
	}
	
}
