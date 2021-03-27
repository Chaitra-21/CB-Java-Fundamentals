package problems;
import java.util.*;
public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		pattern1(num);
		pattern2(num);
		sc.close();
	}
	public static void pattern1(int num) {
		if(num==0)
			return;
		
		System.out.println(num);
		pattern1(num-1);
	}
	public static void pattern2(int num) {
		if(num==0)
			return;
		
		pattern2(num-1);
		System.out.println(num);
	}
}
