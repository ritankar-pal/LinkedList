package in.dsa;

public class HappyNo {
	/*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

*/
	
	public boolean isHappy(int n) {
		
		int slow = n;
		int fast = n;
		
		do {
			slow = findSquare(slow);
			fast = findSquare(findSquare(fast));
		}
		while(slow != fast);
		
		if(slow == 1) return true;
		else return false;
	}
	
	private int findSquare(int num) {
		
		int ans = 0;
		
		while(num > 0) {
			int rem = num % 10;
			ans = ans + (rem*rem);
			num = num/10;
		}
		
		return ans;
	}
	
}
