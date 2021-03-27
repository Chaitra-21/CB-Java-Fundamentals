package problems;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal");
		int p=sc.nextInt();
		System.out.println("Enter Rate of Intrest");
		float r=sc.nextFloat();
		System.out.println("Enter Time");
		int t=sc.nextInt();
		sc.close();
		float si=(p*r*t)/100;
		System.out.println("Simple Intrest is "+si);
	}

}
