import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first ");
		num1= sc.nextInt();
		System.out.println("Enter next number");
		num2= sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println("Sum of two numbers:" + sum);
	}
}
