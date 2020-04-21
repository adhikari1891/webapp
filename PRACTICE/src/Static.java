
class Name {
	String model;
	public void MotherBoard(String model) {
		this.model=model;
	}
	
	//static nested class
	static class USB{
		int usb1 = 5;
		int usb2 = 9;
		int getTotalPorts() {
			// accessing the variable member of the outer class
			
			if( Name.this.model.equals("Majaratti")) {
				return 90;
			}
			else {
				return usb1 + usb2;
			}
		}
	}

}
public class Static{
	public static void main(String[] args) {
		
		// create an objext of the  static nested class
		
		Name.USB usb = new Name.USB();
	System.out.println("Total ports = " + usb.getTotalPorts());	
	}
}
//prints error 
