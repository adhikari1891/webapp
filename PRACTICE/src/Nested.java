
 class Nesting {
	 //inner class
	 class Reptile {
		 public void displayInfo() {
			 System.out.println(" I am a reptile:");
		 }
		 
	 }
	 //static class
	 static class Mammal{
		 public void displayInfo() {
			 System.out.println(" I am a mammal:");
			 
		 }
	 }

}
class Nes{
	public static void main(String[] args) {
		Nesting n1 = new Nesting();
		// creating object of non-static class
		Nesting.Reptile reptile = n1.new Reptile();
		reptile.displayInfo();
		
		//creating object of static nested class
		
		Nesting.Mammal mammal = new Nesting.Mammal();
	mammal.displayInfo();	
	}
}