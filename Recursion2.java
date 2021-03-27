package problems;
import java.util.*;
public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		pattern(num);
		sc.close();
	}
	public static void pattern(int num) {
		if(num==0)return;
		
		if(num%2!=0) 
			System.out.println(num);
			
		pattern(num-1);
		
		if(num%2==0)
			System.out.println(num);
	}
}
