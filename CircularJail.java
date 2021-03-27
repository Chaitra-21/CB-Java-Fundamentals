//not working
package problems;

//import java.util.*;
public class CircularJail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc= new Scanner(System.in);
		int n = 2;
		int jail[] = new int[100];
		// 0=open 1=close
		for (int i = 1; i <= 100; i++) {
			jail[i] = 0;
		}
		while (n <= 100) {
			for (int i = 1; i <= 100; i++) {
				if (i % n == 0) {
					if (jail[i] == 1) {
						jail[i] = 0;
					} else {
						jail[i] = 1;
					}
				}

			}
			n++;
		}
		int i=1;
		while(i<=100) {
			System.out.println(jail[i]);
		}
	}
}
