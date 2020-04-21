
public class p3 {
public static void main(String[] args) {
	String str = "RajkumarAdhikari";
	
	int hey = 0;
	for(int i = 0; i<=str.length()-1;i++) {
		if(str.charAt(i) == 'R') {
			hey++;
		}
	}
	System.out.println("Char R occured " +hey+ " time in the string");
}
}
