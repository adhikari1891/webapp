
//To access elements sequentiallly we use iterator 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class p5 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Mercedez");
		animals.add("Bentley");
		animals.add("ferrarrio");
		animals.add("ferrarrion");
		System.out.println("Unsoted ARRAYLIST" + animals);
		
		Collections.sort(animals);
		System.out.println("Sorted ArrayList" + animals);
		
		for(int i=0;i<animals.size();i++) {
			System.out.println(animals.get(i));
			System.out.println(",");
			
		}
		//Using advanced for:each loop
		for(String animal: animals) {
			System.out.println(animal);
			System.out.println(",");
		}
		String remove = animals.remove(2);
		System.out.println("removed element" + remove);

		Iterator<String> iterate = animals.iterator();
		System.out.println("ArrayList: ");
		
		//hasNext returns true if there is a next element in the arrayList
		//next returns the next element in arrayList
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(" ,");
		}
	}
}
