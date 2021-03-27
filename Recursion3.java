package problems;
import java.util.*;
public class Recursion3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int res=fact(num);
		System.out.println("Result: "+res);
		sc.close();
	}
	public static int fact(int num) {
		if(num==0)
			return 1;
		
		int res=num*fact(num-1);
		
		return res;
	}
}
