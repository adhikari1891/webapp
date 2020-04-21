// Implementing LinkedLIst class
import java.util.List;
import java.util.LinkedList;

class Main{
	public static void main(String[] args) {
		//Creating LIst using LinkedList class
		List<Integer> numbers = new LinkedList<>();
		//Add elements
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		System.out.println(""+ numbers);
		
		//access element
		int number = numbers.get(2);
		System.out.println(""+ number);
		//using indexOf() method
		int index = numbers.indexOf(2);
		System.out.println(" Position of 3 is ?" + index);
		
		//remove 
		int removeNumber = numbers.remove(1);
		System.out.println("Removed"+ removeNumber);
		
	}
}