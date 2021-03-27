package problems;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int num=sc.nextInt();
		int count=1,a=0,b=1,sum;
		while(count<=num+1) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			count++;
		}
		sc.close();
	}

}
