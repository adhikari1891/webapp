interface Ram{
	public default void print() {
		System.out.println(" Inside print class");
	}
}

class Anonymousdemo{
	public void createclass() {
		//creating ram object
		Ram r1 = new Ram()
		{
			//anonymous class helps to override the print class
			
			public void print() {
				System.out.println(" Inside an anonymous class");
			}
		};
		r1.print();
	}
}
public class Anonymousclass {
public static void main(String[] args) {
	Anonymousdemo ad = new Anonymousdemo();
	ad.createclass();
}
}
