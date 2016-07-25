import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Square root & Cube root of a Number");
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		System.out.println("Square Root of "+num+" is "+Math.sqrt(num));
		System.out.println("Cube Root of "+num+" is "+Math.cbrt(num));
		s.close();
	}
}
