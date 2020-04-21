// static class inside another class
 class StaticNeste {
	static class USB{
		int usb1= 5;
		int usb2=9;
		int getTotalPorts() {
			return usb1 + usb2;
		}
	}

}
public class StaticNested{
	public static void main(String[] args) {
		 StaticNeste.USB usb = new StaticNeste.USB();
		 System.out.println(" Total ports: " + usb.getTotalPorts());
	}
	
}
