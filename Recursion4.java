package problems;
import java.util.*;
public class Recursion4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num and pow");
		int num=sc.nextInt();
		int pow=sc.nextInt();
		int result=power(num,pow);
		System.out.println("Result: "+result);
		sc.close();
	}
	
	public static int power(int num, int pow) {
		if(pow==0)
			return 1;
		int n=power(num,pow-1);
		int res=num*n;
		return res;
		
	}

}
