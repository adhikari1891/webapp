class nem{
	double price;
	//nested class
	class Processor{
		double cores;
		String manufacturer;
		
		double getCache() {
			return 4.3;
			
		}
	}
	
	//nested class
	protected class RAM{
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
			
		}
	}
}

public class Multiarray{
	public static void main(String[] args) {
		//create object of OUTER class CPU
		nem cpu = new nem();
		//creaye an object of inner class Processor using outer class
		nem.Processor processor = cpu.new Processor();
		//create an object of inner class RAM using outer class Multiarray
		
		nem.RAM ram = cpu.new RAM();
		System.out.println("" + processor.getCache());
		System.out.println("" + ram.getClockSpeed());
		
		
		
	}
	
}