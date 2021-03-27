package problems;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		boolean flag=true;
		int div=2;
		while(div<=(n-1)) {
			if(n%div==0) {
				flag=false;
			}
		div++;	
		}
		if(flag==true) {
			System.out.println("It is Prime");
		}else {
			System.out.println("It is not Prime");
		}
		sc.close();
	}

}
