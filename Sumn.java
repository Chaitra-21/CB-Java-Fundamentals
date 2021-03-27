package problems;
import java.util.Scanner;
public class Sumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int sum=0,i=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
