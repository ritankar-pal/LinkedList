package in.ineuron.List;
import java.util.ArrayList;


public class RemoveConsecutiveDuplicaesFromArray {
	
	public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1])
				list.add(arr[i]);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,10,10,20,30,30,40,10,50,50,30};
		
		ArrayList<Integer> list = removeConsecutiveDuplicates(arr);
		
		for (Integer elem : list) {
			System.out.print(elem + " ");
		}
		
	}
	
}
