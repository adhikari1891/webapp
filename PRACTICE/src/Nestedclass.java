// access member of  outer class within inner class
class Nested {
String carName;
String carType;

//assign values using constructor

public Nested(String name, String type) {
	this.carName=name;
	this.carType=type;
	
}

//private method
private String getCarName() {
	return this.carName;
}
//inner class
class Engine{
	String engineType;
	void setEngine() {
		//accessing the cartype property of Nestedclass
		if(Nested.this.carType.equals("4WD")) {
			//Nested.this.getCarName() access the member of outer class
			// but this.getCarName() access inner class member
			//getCarName()is a private method we are able to access it from the inner class			
			if(Nested.this.getCarName().equals("Honda")) {
				this.engineType="Larger";
			}else {
				this.engineType="Smaller";
			}
			
		}else {
			this.engineType="Bigger";
		}
	}
	String getEngineType() {
		return this.engineType;
	}
}

}
public class Nestedclass{
	public static void main(String[] args) {
		//Create object of outer class Nested
		
		Nested nested = new Nested("Mazda","8WD");
		
		//create an object of inner class using the outer class
		
		Nested.Engine engine = nested.new Engine();
		engine.setEngine();
		System.out.println("Engine type for 8WD = " + engine.getEngineType());
		
		Nested nested1 = new Nested("Crysler","4WD");
		Nested.Engine engine1 = nested1.new Engine();
		engine1.setEngine();
		System.out.println("Engine type for 4WD = " + engine1.getEngineType());
	}
	
}