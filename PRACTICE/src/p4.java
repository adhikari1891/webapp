//ArrayList class helps us to create resizable arrays rather than array
// ArrayList automatically resize its capacity when we add or remove elements from it
//Hence it is called dynamic array
//ArrayList<Type> variable = new ArrayList<>();
//Type is either Integer or String
import java.util.ArrayList;
import java.util.Arrays;

public class p4 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		//adding elements in arrayList
		animals.add(0,"Dog");
		animals.add(1,"Cat");
		animals.add(2,"Elephant");
		System.out.println("ArrayList " + animals);

		//We gonna add elements from previous arrayList to new ArrayList
		
		ArrayList<String> mammals = new ArrayList<>(Arrays.asList("Cow","Goat"));
		mammals.add("man");
		//add all elements from animals to mammals
		mammals.addAll(animals);
		String elemets = mammals.get(2);
		System.out.println("Get element " + elemets);
		System.out.println("Animals" + mammals);
}
}
