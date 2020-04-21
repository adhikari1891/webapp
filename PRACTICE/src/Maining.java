class Animal{
	static class Mammal{
		System.out.println("I am a mammal");
		
	}
}
class Reptile{
	public void displayInfo() {
		System.out.println(" I am a reptile");
	}


public void eat() {
	System.out.println(" I eat food");
}
}
class Maining{
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal.Reptile reptile = animal.new Reptile();
		reptile.displayInfo();
		
		Animal.Mammal mammal = new Animal.Mammal();
	mammal.displayInfo();
	mammal.eat();
	// points to remember 
	// We cannot access non-static method inside of static classes
	
	}
}
























public class Maining {

}
